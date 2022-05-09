package com.example.usermicroservicetest.User.Services;

import com.example.usermicroservicetest.User.Models.User;
import org.springframework.http.HttpStatus;

public interface UserEntityService {
    public String addUser(User user) throws Exception;
}
