package com.prajwal.week4.practice17.task17;

import java.time.LocalDate;

public class Book{
    //    Books-> Book ID, Book Name, Book Author, Issued to, Issued on
    private int bookID;
    private String bookName;
    private String bookAuthor;
    private String bookIssuerName;
    private LocalDate bookIssuedOn;
    private LocalDate bookReturnDate;

    public Book(int bookID, String bookName, String bookAuthor) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
    public Book(int bookID,String bookName,String bookIssuerName,LocalDate bookIssuedOn,LocalDate bookReturnDate){
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookIssuerName = bookIssuerName;
        this.bookIssuedOn = bookIssuedOn;
        this.bookReturnDate = bookReturnDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookIssuerName() {
        return bookIssuerName;
    }

    public void setBookIssuerName(String bookIssuerName) {
        this.bookIssuerName = bookIssuerName;
    }

    public LocalDate getBookIssuedOn() {
        return bookIssuedOn;
    }

    public void setBookIssuedOn(LocalDate bookIssuedOn) {
        this.bookIssuedOn = bookIssuedOn;
    }

    public LocalDate getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(LocalDate bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookIssuerName='" + bookIssuerName + '\'' +
                ", bookIssuedOn=" + bookIssuedOn +
                ", bookReturnDate=" + bookReturnDate +
                '}';
    }
}
