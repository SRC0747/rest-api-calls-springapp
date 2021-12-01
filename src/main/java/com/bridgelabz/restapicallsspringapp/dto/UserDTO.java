package com.bridgelabz.restapicallsspringapp.dto;

/**
 * Purpose : Invoke details of the user
 *
 * @author : Sampriti Roy Chowdhury
 * @version : 0.0.1
 * @since : 1-12-2021
 */

public class UserDTO {
    private String firstName;
    private String lastName;

    /**
     * Purpose : This method is used to get the firstName of the user
     *
     * @return firstName of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Purpose : This method is used to set the firstName of the user
     *
     * @param firstName defines the first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Purpose : This method is used to get the lastName of the user
     *
     * @return lastName of the user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Purpose : This method is used to set the lastName of the user
     *
     * @param lastName defines the first name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Purpose : This method is used to represent the firstName and lastName assigned for the user
     *
     * @return the string representation of firstName and lastName
     */
    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
