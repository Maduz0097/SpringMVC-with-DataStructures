package com.example.demo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BookService {
   private static List<Book> books = new ArrayList<>();
private static int bookCount = 3;
    static {
        books.add(new Book(1,"Potter",new Date()));
        books.add(new Book(2,"Harry",new Date()));
        books.add(new Book(3,"Rowling",new Date()));
    }
public List<Book> findAllBooks(){
        return books;
}

public Book adBook(Book book){
        if (book.getBookId()== null){
            book.setBookId(bookCount++);
        }
        books.add(book);
        return book;
}

public Book findBook(int id){
        for (Book book:books){
            if (book.getBookId()== id){
                return book;
            }
        }
        return null;
}
}
