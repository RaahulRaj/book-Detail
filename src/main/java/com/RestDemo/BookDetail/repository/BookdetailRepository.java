package com.RestDemo.BookDetail.repository;

import com.RestDemo.BookDetail.modal.Bookdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookdetailRepository extends JpaRepository <Bookdetail,String>{
}
