package com.prajwal.week4.practice17.task17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LMS {
    private CentralLibrary centralLibrary;
    public Scanner inp;
    public LMS(){
        this.centralLibrary = new CentralLibrary();
        this.inp = new Scanner(System.in);
    }
    public void startLibrarySystem(){
        System.out.println("\t\t\" Welcome to Central Library of Renocrew Solutions \"\t\t");

        System.out.println("Are you registered user (y/n): ");
        String res = inp.next();
        if (res.equals("y")){
            System.out.println("Login : ");
            System.out.print("Enter userID: ");
            int userId = inp.nextInt();
            System.out.print("Enter the user-name: ");
            String userName = inp.nextLine();
            inp.nextLine();
            if (centralLibrary.login(userId,userName)){
                openLibrary();
            }
        } else {
            System.out.println("Enter your username: ");
            String userName = inp.next();
            System.out.println("\nEnter your emailID: ");
            String userEmail = inp.next();
            System.out.println();
            int userID = centralLibrary.registerUsers(userName, userEmail);
            System.out.println("Your userID is " + userID);
            if (centralLibrary.login(userID,userName)){
                centralLibrary.addDefaultBooks();
                openLibrary();
            }else {
                System.out.println("Some error occurred !");
            }
        }

    }

    private void openLibrary() {
        do{
            System.out.println("Welcome to the Library ! ");
            System.out.println("1. Show Available Books.");
            System.out.println("2. Add Books.");
            System.out.println("3. Issue a Book.");
            System.out.println("4. Return a Book.");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int ch = inp.nextInt();
            inp.nextLine();

            switch (ch){
                case 1: centralLibrary.showAvailableBooks();
                break;
                case 2: addBooks();
                break;
                case 3: issueBook();
                break;
                case 4: returnBook();
                break;
                case 5: System.exit(0);
                break;
                default:
                    System.out.println("Invalid Choice ! Please enter a valid choice (1 to 5): ");
            }
        } while (true);
    }
    public void addBooks(){
        System.out.println("Enter the number of books to add: ");
        int noOfBooks = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the book id : ");
        int bookID = inp.nextInt();
        inp.nextLine();
        System.out.print("Enter the book name: ");
        String bookName = inp.nextLine();
        inp.nextLine();
        System.out.print("Enter the book author: ");
        String bookAuthor = inp.nextLine();
        inp.nextLine();
        centralLibrary.addBooks(noOfBooks,bookID,bookName,bookAuthor);
    }
    public void issueBook(){
        System.out.println("Enter the book id: ");
        int bookId = inp.nextInt();
        inp.nextLine();
        System.out.print("Enter the book name: ");
        String bookName = inp.nextLine();
        inp.nextLine();
        System.out.print("Enter your userName: ");
        String userName = inp.nextLine();
        inp.nextLine();
        LocalDateTime issueDate = LocalDateTime.now();
        System.out.println("Enter return date(YYYY-MM-DD HH:MM): ");
        String date = inp.nextLine();
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime returnDate = null;
        try {
            returnDate = LocalDateTime.parse(date,dTF);
        } catch (Exception e){
            System.out.println("Invalid date time format . Enter (yyyy-MM-dd HH:mm) this format.");
        }
        Book issuedBook = centralLibrary.issueBook(bookId, bookName, userName, issueDate, returnDate);
        if (issuedBook != null) {
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Failed to issue the book. Please check the details.");
        }
    }
    public void returnBook(){
        System.out.print("Enter the book id: ");
        int bookId = inp.nextInt();
        System.out.print("Enter the book name: ");
        String bookName = inp.nextLine();
        inp.nextLine();
        System.out.print("Enter your userName: ");
        String userName = inp.nextLine();
        inp.nextLine();
        System.out.println("Enter issued date(YYYY-MM-DD HH:MM): ");
        String date = inp.nextLine();
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime issueDate = null;
        try {
            issueDate = LocalDateTime.parse(date,dTF);
        } catch (Exception e){
            System.out.println("Invalid date time format . Enter (yyyy-MM-dd HH:mm) this format.");
        }
        LocalDateTime returnDate = LocalDateTime.now();
        Book returnedBook = centralLibrary.returnBook(bookId,bookName, userName, issueDate, returnDate);
        if (returnedBook != null) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Failed to return the book. Please check the details.");
        }
    }

}
