package com.menezesmarlon.drogaria_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class DrogariaController {

    @RequestMapping("/hello")
    public String showMesssage() {
        return "Hello, World";
    }

}
