package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.controller;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")   //base URI - whenever u want to define the base URI for all rest api within controller class
                            //@RequestMapping with class
public class BookController_QueryParam {

    //http://localhost:8080/api/book?id=1&title=Spring boot&description=Learning book is avaliable-cost is 100
    @GetMapping("/book/query")
    public ResponseEntity<Book> requestParamBookApi(@RequestParam(name = "id") int id){
        System.out.println(id);
//        System.out.println(title);
//        System.out.println(description);
        Book book = new Book();
        book.setId(id);
//        book.setTitle(title);
//        book.setDescription(description);
        return ResponseEntity.ok(book);
    }
}
