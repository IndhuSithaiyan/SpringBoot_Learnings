package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.controller;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   //base URI - whenever u want to define the base URI for all rest api within controller class
                            //@RequestMapping with class
public class BookController_POST_Method {

//    @RequestMapping(value = "/book/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    @PostMapping("/book/create")
    @PostMapping(value = "/book/create",
    consumes = MediaType.APPLICATION_JSON_VALUE
    )
//    @ResponseStatus(value = HttpStatus.CREATED)     //to specify the status as 201 created. either we can use ResponseEntity<>
    public ResponseEntity<Book> createBookApi(@RequestBody Book book){      //@RequestBody is responsible to retrieve the request body and it will convert the JSON into 'book' java object
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
