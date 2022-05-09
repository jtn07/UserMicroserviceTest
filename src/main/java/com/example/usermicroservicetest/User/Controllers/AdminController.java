package com.example.usermicroservicetest.User.Controllers;

import com.example.usermicroservicetest.User.Models.UserDto;
import com.example.usermicroservicetest.User.Services.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "/addRole", method= RequestMethod.POST)
    public String addRole(String roleName){
        return adminService.addRole(roleName);
    }

    @RequestMapping(value ="/getUserDetailsByEmail", method =RequestMethod.GET)
    public UserDto getUserDetailsByEmail(String email){
        return adminService.getUserDetails(email);
    }

}
