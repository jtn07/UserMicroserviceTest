package com.example.usermicroservicetest.User.Models;

import lombok.Data;

import javax.persistence.*;


@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
}
