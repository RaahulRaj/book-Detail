package com.RestDemo.BookDetail.exception;

public class BookdetailNotFoundException extends RuntimeException{
    public BookdetailNotFoundException(String message) {
        super(message);
    }

    public BookdetailNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
