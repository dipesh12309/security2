package com.project.backend.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {
    @GetMapping("/myCards")
    public String getCardsDetails(){
        return "my cards";
    }
}
