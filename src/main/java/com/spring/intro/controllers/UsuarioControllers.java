package com.spring.intro.controllers;
import com.spring.intro.models.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioControllers {
//handle URLs, endpoint

    @RequestMapping(value = "user")


    //content to display in the corresponding "/user" url
    public User getUser(){
        User user = new User();
        user.setName("Bee");
        user.setLastName("Flying");
        user.setEmail("bb@fly.com");
        user.setPhone("123");
        return user;
    }


}
