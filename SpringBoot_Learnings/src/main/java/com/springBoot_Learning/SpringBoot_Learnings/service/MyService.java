package com.springBoot_Learning.SpringBoot_Learnings.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public String hello(){
        return "Helo Service...!";
    }

    @Scheduled(cron = "*/30 * * * * *")
    public void cronJobSch() {
        logger.info("Initiated cronJobSch");

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        Date now = new Date();
//        String strDate = sdf.format(now);
//        System.out.println("Java cron job expression:: " + strDate);
        System.out.println("Java cron job expression:: " + LocalDateTime.now());
    }
}
