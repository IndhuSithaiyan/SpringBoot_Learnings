package com.springBoot_Learning.SpringBoot_Learnings.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class fakerConfig {

    @Bean
    public Faker getFacker(){
        return new Faker();
    }
}
