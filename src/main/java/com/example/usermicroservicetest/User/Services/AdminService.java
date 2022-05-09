package com.example.usermicroservicetest.User.Services;

import com.example.usermicroservicetest.User.Models.UserDto;

public interface AdminService {
    public String addRole(String name);
    public UserDto getUserDetails(String email);
}
