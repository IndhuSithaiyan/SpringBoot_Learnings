package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.controller;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   //base URI - whenever u want to define the base URI for all rest api within controller class
                            //@RequestMapping with class
public class BookController_PUT_Method {

    @PostMapping(value = "/book/update/{id}")
    public ResponseEntity<Book> updateBookApi(@PathVariable int id, @RequestBody Book updatebook){      //@RequestBody is responsible to retrieve the request body and it will convert the JSON into 'book' java object
        System.out.println(id);
        System.out.println(updatebook.getTitle());
        System.out.println(updatebook.getDescription());
        updatebook.setId(id);
        return new ResponseEntity<>(updatebook, HttpStatus.OK);
    }
}
