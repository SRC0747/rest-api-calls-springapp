package com.bridgelabz.restapicallsspringapp.controller;

import com.bridgelabz.restapicallsspringapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiCallsController {

    @GetMapping(value = "/message")
    public String getMessage() {
        return "Hello From BridgeLabz";
    }

    @GetMapping(value = "/message1")
    public String getMessageInvokingQueryParameter
            (@RequestParam String firstName,
             @RequestParam String lastName) {
        return "Hello From BridgeLabz : " + firstName + " " + lastName;
    }

    @GetMapping(value = "/message2/{name}")
    public String getMessageInvokingPathVariable
            (@PathVariable String name) {
        return "Hello : " + name + " from BridgeLabz";
    }

    @PostMapping(value = "/message3")
    public String getUserDetails(@RequestBody UserDTO userDTO) {
        return userDTO.toString();
    }
}
