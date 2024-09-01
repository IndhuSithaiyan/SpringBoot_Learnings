package com.springBoot_Learning.SpringBoot_Learnings.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        return "Hello controller...!";
    }
}
