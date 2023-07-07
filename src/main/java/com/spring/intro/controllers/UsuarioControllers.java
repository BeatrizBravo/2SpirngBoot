package com.spring.intro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioControllers {
//handle URLs, endpoint

    @RequestMapping(value = "endPoint") //to indicate the url that returns the following content


    //content to display in the corresponding url
    public List<String> displayingAList(){
        return List.of("thing1","thing2","thing2");
    }
}
