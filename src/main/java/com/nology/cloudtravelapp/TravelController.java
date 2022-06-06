package com.nology.cloudtravelapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
//
//    public String addLocation(@RequestBody Locations text){
//        this.locationRepository.save(text);
//        System.out.println("Added"+text);
//        return "Location saved";
//    }
}
