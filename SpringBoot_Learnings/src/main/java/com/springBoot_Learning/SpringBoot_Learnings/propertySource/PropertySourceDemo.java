package com.springBoot_Learning.SpringBoot_Learnings.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    @Value("${gmail.host}")
    private String host;

    @Value("${gmail.id}")
    private String email;

    @Value("${gmail.password}")
    private String password;

    @Value("${message.host}")
    private String messageHost;

    @Value("${message.id}")
    private String messageEmail;

    @Value("${message.password}")
    private String messagePassword;

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMessageHost() {
        return messageHost;
    }

    public String getMessageEmail() {
        return messageEmail;
    }

    public String getMessagePassword() {
        return messagePassword;
    }
}
