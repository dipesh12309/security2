package com.project.backend.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
    @GetMapping("/contacts")
    public String getContacts(){
        return "contacts ";
    }
}
