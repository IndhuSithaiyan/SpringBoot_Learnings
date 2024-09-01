package com.springBoot_Learning.SpringBoot_Learnings.config;

import com.springBoot_Learning.SpringBoot_Learnings.controller.PizzaController;
import com.springBoot_Learning.SpringBoot_Learnings.service.NonVegPizza;
import com.springBoot_Learning.SpringBoot_Learnings.service.Pizza;
import com.springBoot_Learning.SpringBoot_Learnings.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Java based Configuration

@Configuration
public class AppConfig {

//    @Bean(name = "veg-pizzaBean")
    @Bean       //Calling by class name
    public Pizza vegPizza(){
        return new VegPizza();      //Creating object with new keyword
    }

    @Bean       //Calling by class name
    public Pizza nonvegPizza(){
        return new NonVegPizza();      //Creating object with new keyword
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")       //make sure the method name should be same as bean name
    public PizzaController pizzaController(){
//        return new PizzaController(vegPizza());      //Creating object with new keyword
        return new PizzaController(nonvegPizza());      //Creating object with new keyword
    }

}
