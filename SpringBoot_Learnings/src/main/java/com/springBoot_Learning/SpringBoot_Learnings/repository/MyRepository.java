package com.springBoot_Learning.SpringBoot_Learnings.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String hello(){
        return "Hello Repository...!";
    }

}
