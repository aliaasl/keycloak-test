package com.example.keycloaktest.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest")
public class RestService {
    @GetMapping(value = "/get-time-1", produces = "application/json")
    public Date getDateTime() {
        return new Date();
    }
}