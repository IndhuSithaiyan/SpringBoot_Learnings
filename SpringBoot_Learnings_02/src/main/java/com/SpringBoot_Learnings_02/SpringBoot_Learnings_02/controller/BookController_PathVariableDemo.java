package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.controller;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   //base URI - whenever u want to define the base URI for all rest api within controller class
                            //@RequestMapping with class
public class BookController_PathVariableDemo {

    @GetMapping(value = "/book/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableBookApi(@PathVariable int id,
                                                    @PathVariable("title") String booktitle,    //variable name & URI template name both should be same if not we need to pass that URI template name inside @PathVariable
                                                    @PathVariable String description){
        System.out.println(id);
        System.out.println(booktitle);
        System.out.println(description);
        Book book = new Book();
        book.setId(id);
        book.setTitle(booktitle);
        book.setDescription(description);
        return ResponseEntity.ok(book);
    }
}
