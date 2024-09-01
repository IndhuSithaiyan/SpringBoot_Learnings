package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.controller;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")   //base URI - whenever u want to define the base URI for all rest api within controller class
                            //@RequestMapping with class
public class BookController_GET_Method {

    @RequestMapping("/helloworld")      //@RequestMapping with method
//    @ResponseBody
    public String helloWorld(){
        return "hello world..!";
    }

    /*
//    @RequestMapping("/book")
    @RequestMapping(value = {"/book","/javabook","/core-java"},     //multiple HTTP URI
    method = RequestMethod.GET                 //request method type
//    produces = MediaType.APPLICATION_JSON_VALUE,    //produces format
//    consumes = MediaType.APPLICATION_JSON_VALUE
    )
    */

//    @GetMapping("/book")
    @GetMapping(value = {"/book","/javabook"})

//    @ResponseBody
    public Book getBookApi(){
        Book book = new Book(1, "core java", "Learn core Java and lastest features");
        return book;
    }
}
