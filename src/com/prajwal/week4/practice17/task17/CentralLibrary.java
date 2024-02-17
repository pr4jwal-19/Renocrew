package com.prajwal.week4.practice17.task17;

import java.time.LocalDateTime;
import java.util.*;

public class CentralLibrary implements Users,Books{

    ArrayList<Book> issuedBooks;
    ArrayList<Book> availableBook;
    ArrayList<User> users;
    Random random;
    private final Set<Integer> generatedUserIds;
    public CentralLibrary(){
        issuedBooks = new ArrayList<>();
        availableBook = new ArrayList<>();
        users = new ArrayList<>();
        random = new Random();
        generatedUserIds = new HashSet<>();
    }

    public void addDefaultBooks(){
        availableBook.add(new Book(1004,"The Pianist","Władysław Szpilman"));
        availableBook.add(new Book(1200,"The Godfather","Mario Puzo"));
        availableBook.add(new Book(1422,"Harry Potter and the Half Blood","JK Rowling"));
    }

    @Override
    public void showAvailableBooks() {
        System.out.println("Available Books : ");
        for (Book book:availableBook){
            System.out.println("Book ID : "+book.getBookID());
            System.out.println("Book Name: "+book.getBookName());
            System.out.println("Book Author: "+book.getBookAuthor());
        }
    }

    @Override
    public void addBooks(int noOfBooks, int bookID, String bookName, String bookAuthor) {
        for (int i = 0; i < noOfBooks; i++){
            availableBook.add(new Book(bookID,bookName,bookAuthor));
        }
        System.out.println("Books were added !");
    }

    @Override
    public Book issueBook(int bookID, String bookName, String userName, LocalDateTime bookIssuedOn, LocalDateTime returnDate) {

        // Find the book in available books by ID
        Book book = availableBook.stream()
                .filter(b -> b.getBookID() == bookID)
                .findFirst()
                .orElse(null);

        // If book is found, remove it from available books and add to issued books
        if (book != null) {
            issuedBooks.add(book);
            availableBook.remove(book);
            book.setBookIssuerName(userName);
            book.setBookIssuedOn(bookIssuedOn);
            book.setBookReturnDate(returnDate);
            return book;
        } else {
            System.out.println("Book not found in available books.");
            return null;
        }

    }

    @Override
    public Book returnBook(int bookID, String bookName,String userName, LocalDateTime bookIssuedOn, LocalDateTime returnDate) {

        // Find the book in issued books by ID
        Book book = issuedBooks.stream()
                .filter(b -> b.getBookID() == bookID)
                .findFirst()
                .orElse(null);

        // If book is found, remove it from issued books and add to available books
        if (book != null) {
            availableBook.add(book);
            issuedBooks.remove(book);
            book.setBookIssuerName(null);
            book.setBookIssuedOn(null);
            book.setBookReturnDate(null);
            return book;
        } else {
            System.out.println("Book not found in issued books.");
            return null;
        }

    }

    @Override
    public int registerUsers(String userName, String userEmail) {
        //users.add(new User(userName,userEmail));
        int userID;
        do{
            userID = (int) (random.nextDouble() * Integer.MAX_VALUE) + 1;
            users.add(new User(userID,userName,userEmail));
        } while (!generatedUserIds.add(userID));
        return userID;
    }

    @Override
    public boolean login(int userID, String userName) {
        for (User user:users){
            if (user.getUserID()==userID && Objects.equals(user.getUserName(), userName)){
                System.out.println("Logged in successfully....");
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayUserDetails() {
        System.out.println("User Details: ");
        for (User user:users){
            System.out.println("User ID: "+user.getUserID());
            System.out.println("Username: "+user.getUserName());
            System.out.println("User mail: "+user.getUserEmail());
        }
    }

    @Override
    public void displayIssuedHistory(int userID, String userName) {
        for (Book book: issuedBooks){
            if (Objects.equals(book.getBookIssuerName(), userName)){
                System.out.println("Book iD: "+book.getBookID());
                System.out.println("Book Name: "+book.getBookName());
                System.out.println("Issued by: "+book.getBookIssuerName());
                System.out.println("Issued On: "+book.getBookIssuedOn());
                System.out.println("Return date: "+book.getBookReturnDate());
            }
        }
    }

    @Override
    public void changeUserName(String oldUserName,String newUserName) {
        for (User user: users){
            if (Objects.equals(user.getUserName(), oldUserName)){
                user.setUserName(newUserName);
            }
        }
    }

    @Override
    public void changeUserEmail(String oldUserEmail,String newUserEmail) {
        for (User user:users){
            if (Objects.equals(user.getUserEmail(), oldUserEmail)){
                user.setUserEmail(newUserEmail);
            }
        }
    }
}
