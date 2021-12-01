package com.bridgelabz.restapicallsspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiCallsController {

    @GetMapping(value = "/message")
    public String getMessage() {
        return "Hello From BridgeLabz";
    }

    
}
