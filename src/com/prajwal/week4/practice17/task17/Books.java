package com.prajwal.week4.practice17.task17;

import java.time.LocalDateTime;

public interface Books {
    void showAvailableBooks();
    void addBooks(int noOfBooks,int bookID, String bookName, String bookAuthor);
    Book issueBook(int bookID, String bookName, String userName, LocalDateTime bookIssuedOn,LocalDateTime returnDate);
    Book returnBook(int bookID,String bookName,String userName,LocalDateTime bookIssuedOn, LocalDateTime returnDate);
}
