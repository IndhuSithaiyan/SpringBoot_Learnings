package com.springBoot_Learning.SpringBoot_Learnings.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("NON-veg Pizza")
//@Primary        //spring container IOC will give higher preference to @Primary
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "Non-veg Pizza !";
    }
}
