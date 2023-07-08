package com.spring.intro.controllers;
import com.spring.intro.models.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioControllers {
//handle URLs, endpoint

    @RequestMapping(value = "user/{id}")// to make dynamic you add {id}, and create the atributes and method in its own class
    public User getUser(@PathVariable int id){
        User user = new User();
        user.setId(id);
        user.setName("Bee");
        user.setLastName("Flying");
        user.setEmail("bb@fly.com");
        user.setPhone("123");
        return user;
    }

    @RequestMapping(value = "user/updateUser/{id}")
    public User updateUser(){
        User user = new User();
        user.setName("a");
        user.setLastName("a");
        user.setEmail("bb@fly.com");
        user.setPhone("123");
        return user;
    }


    @RequestMapping(value = "user/deleteUser/{id}")
    public User deleteUser(){
        User user = new User();
        user.setName("e");
        user.setLastName("e");
        user.setEmail("bb@fly.com");
        user.setPhone("123");
        return user;
    }

    @RequestMapping(value = "user/searchUser/{id}")

    public User searchUser(){
        User user = new User();
        user.setName("Bee");
        user.setLastName("Flying");
        user.setEmail("bb@fly.com");
        user.setPhone("123");
        return user;
    }

}
