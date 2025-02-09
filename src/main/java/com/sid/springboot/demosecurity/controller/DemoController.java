package com.sid.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){

        return "home";
    }

    // add request mapping for /leaders
    @GetMapping("/leaders")
    public String showLeaders(){

        return "leaders";
    }

    // add request mapping for /systems
    @GetMapping("/systems")
    public String showAdmins(){

        return "systems";
    }
}
