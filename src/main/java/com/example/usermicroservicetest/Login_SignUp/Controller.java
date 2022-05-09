package com.example.usermicroservicetest.Login_SignUp;


import com.example.usermicroservicetest.User.Models.User;
import com.example.usermicroservicetest.User.Services.UserEntityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class Controller {

    @Autowired
    UserEntityServiceImpl userEntityService;

    @PostMapping ("/addUser/")
    public String addUser(@RequestBody User user) throws Exception {
       try {
           System.out.println("user added successfully");
           return userEntityService.addUser(user);
       }
       catch (Exception e){
           System.out.println("User cannot be created");
           throw new Exception("User cannot be created") ;
       }
    }
}
