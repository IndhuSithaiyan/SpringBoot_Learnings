package com.springBoot_Learning.SpringBoot_Learnings.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public EagerLoader(){
        System.out.println("EagerLoader.........");
    }
}
