package com.RestDemo.BookDetail.service;

import com.RestDemo.BookDetail.modal.Bookdetail;

import java.util.List;

public interface BookdetailService {
    public String createBookdetail(Bookdetail bookdetail);
    public String updateBookdetail(Bookdetail bookdetail);
    public String deleteBookdetail(String bookdetailId);
    public List<Bookdetail> getAllBookdetail();
    public Bookdetail getBookdetailById(String bookdetailId);
}
