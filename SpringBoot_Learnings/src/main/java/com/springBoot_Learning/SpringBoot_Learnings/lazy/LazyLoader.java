package com.springBoot_Learning.SpringBoot_Learnings.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoader {

    public LazyLoader() {
        System.out.println("Lazy loader........");
    }
}
