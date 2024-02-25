package com.RestDemo.BookDetail.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookdetailExceptionHandler{
   @ExceptionHandler(value = {BookdetailNotFoundException.class})
    public ResponseEntity<Object> handleBookDetailNotFoundException(BookdetailNotFoundException bookdetailNotFoundException){
        BookdetailException bookdetailException = new BookdetailException(
                bookdetailNotFoundException.getMessage(),
                bookdetailNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(bookdetailException,HttpStatus.NOT_FOUND);
    }

}
