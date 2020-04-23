package com.example.demo;

import java.util.Date;

public class Book {


    private Integer bookId;

    private String bookName;

    private Date publishDate;

    public Book(Integer bookId, String bookName, Date publishDate) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.publishDate = publishDate;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }



}
