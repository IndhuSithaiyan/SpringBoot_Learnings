package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.controller;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   //base URI - whenever u want to define the base URI for all rest api within controller class
                            //@RequestMapping with class
public class BookController_DELETE_Method {

    @DeleteMapping(value = "/book/delete/{id}")
    public ResponseEntity<String> deleteBookApi(@PathVariable int id){      //@RequestBody is responsible to retrieve the request body and it will convert the JSON into 'book' java object
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully!..");
    }
}
