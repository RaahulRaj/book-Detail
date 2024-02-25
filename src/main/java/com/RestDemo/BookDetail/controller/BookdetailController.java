package com.RestDemo.BookDetail.controller;

import com.RestDemo.BookDetail.modal.Bookdetail;
import com.RestDemo.BookDetail.service.BookdetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bookdetail")

public class BookdetailController {
    BookdetailService bookdetailService;
    public BookdetailController(BookdetailService bookdetailService) {
        this.bookdetailService = bookdetailService;
    }
@GetMapping("/{bookId}")
    public Bookdetail getBookdetailById(@PathVariable("bookId") String bookId) {
        return bookdetailService.getBookdetailById(bookId);
    }
    @GetMapping()
    public List<Bookdetail> getAllBookdetail(){

        return bookdetailService.getAllBookdetail();
    }
    @PutMapping
    public String updateBookdetail(@RequestBody Bookdetail bookdetail){
        bookdetailService.updateBookdetail(bookdetail);
        return "Book detail updated successfully";
    }
    @PostMapping
    public String createBookdetail(@RequestBody Bookdetail bookdetail){
        bookdetailService.createBookdetail(bookdetail);
        return "Book detail created successfully";
    }
    @DeleteMapping("/{bookId}")
    public String deleteBookdetail(@PathVariable("bookId") String bookId){
        bookdetailService.deleteBookdetail(bookId);
        return "Book detail deleted successfully";
    }

}
