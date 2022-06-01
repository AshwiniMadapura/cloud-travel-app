package com.nology.cloudtravelapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {

    @GetMapping("/location")
    public String getTravelDetails(){
        return "getting location";
    }
}
