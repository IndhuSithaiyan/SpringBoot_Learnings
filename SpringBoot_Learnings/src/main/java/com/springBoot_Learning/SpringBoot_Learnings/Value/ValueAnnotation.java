package com.springBoot_Learning.SpringBoot_Learnings.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {

    @Value("Default Name")
    private String defaultName;

//    @Value("${mail.host}")
//    private String host;
//
//    @Value("${mail.email}")
//    private String email;
//
//    @Value("${mail.password}")
//    private String password;
//
//    @Value("${java.home}")
//    private String javaHome;
//
////    @Value("${HOME}")
////    private String homeDir;
//
//    public String getJavaHome() {
//        return javaHome;
//    }
//
////    public String getHomeDir() {
////        return homeDir;
////    }
//
    public String getDefaultName(){
        return defaultName;
    }
//
//    public String getHost() {
//        return host;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }

}
