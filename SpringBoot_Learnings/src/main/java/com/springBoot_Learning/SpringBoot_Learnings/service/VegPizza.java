package com.springBoot_Learning.SpringBoot_Learnings.service;

import org.springframework.stereotype.Component;

//@Component
public class VegPizza implements Pizza{
    @Override
    public String getPizza(){
        return "Veg pizza !";
    }
}
