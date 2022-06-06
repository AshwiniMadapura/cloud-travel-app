package com.nology.cloudtravelapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class TravelController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/location")
    public String getTravelDetails(){
        return "getting location";
    }

    @GetMapping("/locations")
    public List<Locations> getLocations(){
        return locationRepository.findAll();
    }

    @PostMapping("/locations")
    public String addLocation(@RequestBody Locations text){
        this.locationRepository.save(text);
        System.out.println("Added"+text);
        return "Location saved";
    }
    @DeleteMapping("/locations/{locationId}")
    @Transactional
    public String deleteLocation(@PathVariable int locationId){
        System.out.println("location= "+locationId);
        int deleted = this.locationRepository.deleteLocationByLocationId(locationId);
        if (deleted > 0) {
            return "Location removed okay";
        }
        return "Location Id doesn't exist";
    }
}
