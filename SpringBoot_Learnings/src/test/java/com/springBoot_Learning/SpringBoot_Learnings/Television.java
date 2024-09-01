package com.springBoot_Learning.SpringBoot_Learnings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {

    private static final Logger logger = LoggerFactory.getLogger(Television.class);

    @Value("${tv.name:sony}")
    private String name;

    public Television() {
        System.out.println("Inside the constructor: "+this.name);
    }

    @PostConstruct
    private void init(){
        logger.info("Initiated postConstruct");
        System.out.println("Inside the init: "+this.name);
        System.out.println("TV is turned on");
    }

    public void playmovies(){
        for (int i=1;i<6;i++){
            System.out.println("Playing scene : "+i);
        }
    }

    @PreDestroy
    public void turnOff(){
        System.out.println("TV is turned off...");
    }
}
