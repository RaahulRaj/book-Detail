package com.RestDemo.BookDetail.service.Impl;

import com.RestDemo.BookDetail.exception.BookdetailNotFoundException;
import com.RestDemo.BookDetail.modal.Bookdetail;
import com.RestDemo.BookDetail.repository.BookdetailRepository;
import com.RestDemo.BookDetail.service.BookdetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookdetailServiceImpl implements BookdetailService{
    BookdetailRepository bookdetailRepository;
    public BookdetailServiceImpl(BookdetailRepository bookdetailRepository) {
        this.bookdetailRepository = bookdetailRepository;
    }


    @Override
    public String createBookdetail(Bookdetail bookdetail) {
        bookdetailRepository.save(bookdetail);
        return "Success";
    }

    @Override
    public String updateBookdetail(Bookdetail bookdetail) {
        bookdetailRepository.save(bookdetail);
        return "Success";
    }

    @Override
    public String deleteBookdetail(String bookdetailId) {
        bookdetailRepository.deleteById(bookdetailId);
        return "Success";
    }

    @Override
    public List<Bookdetail> getAllBookdetail() {
        return bookdetailRepository.findAll();
    }

    @Override
    public Bookdetail getBookdetailById(String bookdetailId) {
        if(bookdetailRepository.findById(bookdetailId).isEmpty()){
            throw new BookdetailNotFoundException("Requested book detail does not exist");
        }
        return bookdetailRepository.findById(bookdetailId).get();
    }
}
