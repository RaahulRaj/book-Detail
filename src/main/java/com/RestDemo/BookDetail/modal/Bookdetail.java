package com.RestDemo.BookDetail.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book_Detail")
public class Bookdetail {
    @Id
    private String bookId;
    private  String title;
    private String author;
    private String genre;

    public Bookdetail() {
    }
    public Bookdetail(String bookId, String title, String author, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getBookId() {return bookId;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getGenre() {return genre;}
    public void setBookId(String bookId) {this.bookId = bookId;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setGenre(String genre) {this.genre = genre;}
}
