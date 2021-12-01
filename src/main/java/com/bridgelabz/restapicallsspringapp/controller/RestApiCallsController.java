package com.bridgelabz.restapicallsspringapp.controller;

import com.bridgelabz.restapicallsspringapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

/**
 * Purpose : Print welcome message by REST API calls to demonstrate REST Request
 *
 * @author : Sampriti Roy Chowdhury
 * @version : 0.0.1
 * @since : 1-12-2021
 */

@RestController
public class RestApiCallsController {

    /**
     * Purpose : This method is used to get Greeting hello message from BridgeLabz
     *
     * @return hello message from BridgeLabz
     */
    @GetMapping(value = "/message")
    public String getMessage() {
        return "Hello From BridgeLabz";
    }

    /**
     * Purpose : This method is used to get greeting hello message invoking firstName and lastName as RequestParameter
     *
     * @param firstName defines firstname of the user passing as RequestParam
     * @param lastName defines firstname of the user passing as RequestParam
     * @return greeting hello message invoking both firstName and lastName
     */
    @GetMapping(value = "/message1")
    public String getMessageInvokingQueryParameter
            (@RequestParam String firstName,
             @RequestParam String lastName) {
        return "Hello From BridgeLabz : " + firstName + " " + lastName;
    }

    /**
     * Purpose : This method is used to get greeting hello message by invoking name as PathVariable
     *
     * @param name defines the passing PathVariable
     * @return greeting hello message invoking name
     */
    @GetMapping(value = "/message2/{name}")
    public String getMessageInvokingPathVariable
            (@PathVariable String name) {
        return "Hello : " + name + " from BridgeLabz";
    }

    /**
     * Purpose : This method is used to post user details stored in DTO
     *
     * @param userDTO defines the details of user
     * @return details of the user
     */
    @PostMapping(value = "/message3")
    public String getUserDetails(@RequestBody UserDTO userDTO) {
        return userDTO.toString();
    }

    /**
     * Purpose : This method is used to put request of invoking both PathVariable and RequestParam
     *
     * @param firstName defines PathVariable
     * @param lastName defines RequestParam
     * @return greeting hello message invoking both PathVariable and RequestParam
     */
    @PutMapping(value = "/message4/{firstName}")
    public String getMessageUsingPutRequest(
            @PathVariable String firstName,
            @RequestParam String lastName
    ) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
