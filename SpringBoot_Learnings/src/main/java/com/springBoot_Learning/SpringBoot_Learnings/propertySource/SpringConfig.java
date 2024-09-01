package com.springBoot_Learning.SpringBoot_Learnings.propertySource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:gmail.properties")
//@PropertySource("classpath:message.properties")

@PropertySources({
        @PropertySource("classpath:gmail.properties"),
        @PropertySource("classpath:message.properties")
})
public class SpringConfig {

}
