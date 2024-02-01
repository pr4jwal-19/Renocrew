package com.prajwal.week3.practice11;

import java.util.ArrayList;
import java.util.Scanner;

class Books{
    protected String bookName;
    protected String bookID;
    protected String issueDate;
    protected String returnDate;

    public Books(String bookName, String bookID, String issueDate, String returnDate) {
        this.bookName = bookName;
        this.bookID = bookID;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

}

class Library{
    static ArrayList<Books> availBooks;
    static ArrayList<Books> issuedBooks;

    public Library() {
        Library.availBooks = new ArrayList<>();
        Library.issuedBooks = new ArrayList<>();
    }
    public static String addBooks(String bookName, String bookID){
        availBooks.add(new Books(bookName,bookID,null,null));
        return "Added Books to the library with name: "+bookName+" with book id: "+bookID;
    }
    public static void issueBook(String bookID,String bookName,String issueDate,String returnDate){
        Books book = new Books(bookName,bookID,issueDate,returnDate);
        issuedBooks.add(book);
        availBooks.remove(book);
    }
    public static void returnBook(String bookID,String bookName,String issueDate,String returnDate){
        Books book = new Books(bookName,bookID,issueDate,returnDate);
        availBooks.add(book);
        issuedBooks.remove(book);
    }
    public static void showAvailableBooks(){
        System.out.println("Available books in the Library: ");
        for (Books book: availBooks){
            System.out.println("Book Name: "+book.bookName);
            System.out.println("Book ID: "+book.bookID);
        }
    }
    public static void showIssuedBooks(){
        System.out.println("Issued Books from the Library: ");
        if (issuedBooks.isEmpty()){
            System.out.println("There are no books issued at the moment !");
        }
        for (Books iBook: issuedBooks){
            System.out.println("Book Name: "+iBook.bookName);
            System.out.println("Book ID: "+iBook.bookID);
            System.out.println("Issued Date: "+iBook.issueDate);
            System.out.println("Return Date: "+iBook.returnDate);
        }
    }
}
class LibrarySystem{
    protected static Library library;
    protected Scanner inp;
    String res;
    public LibrarySystem(){
        if (library==null){
            library = new Library();
        }
        this.inp = new Scanner(System.in);
    }
    public void openLibrary(){

        System.out.println("\"\tWelcome to PN Library\t\"");
        System.out.println("Are you a admin ? (y/n)");
        res = inp.next();
        if (res.equals("y")){
            if (adminLogin()){
                System.out.println("Successfully Logged in !");
                adminMenu();
            }
        } else {
            userMenu();
        }

    }
    private boolean adminLogin(){
        final String adminID = "prajwal19";
        final String adminPass = "pnj1904Lib";
        System.out.print("Enter Admin ID: ");
        String id = inp.next();
        System.out.println();
        System.out.print("Admin password: ");
        String pass = inp.next();

        return id.equals(adminID) && pass.equals(adminPass);
    }
    private void adminMenu(){
        do {
            System.out.println("\t\tAdmin Catalogue: ");
            System.out.println("1. ADD BOOKS");
            System.out.println("2. SHOW AVAILABLE BOOKS");
            System.out.println("3. SHOW ISSUED BOOKS");
            System.out.println("4. EXIT");

            System.out.println("Enter a choice: ");
            int ch = inp.nextInt();
            inp.nextLine();

            switch (ch) {
                case 1:
                    addBooks();
                    break;
                case 2:
                    Library.showAvailableBooks();
                    break;
                case 3:
                    Library.showIssuedBooks();
                    break;
                case 4:
                    System.out.println("Exiting Library !");
                    res = "n";
                    userMenu();
                default:
                    System.out.println("Invalid choice ! Please enter valid choice ...");
            }
        } while (true);
    }
    private void addBooks(){
        System.out.print("Enter Book Name: ");
        String bookName = inp.nextLine();
        System.out.print("\nEnter Book ID: ");
        String bookId = inp.nextLine();
        System.out.println(Library.addBooks(bookName,bookId));
    }
    private void userMenu(){
        do {
            System.out.println("\t\tUser Catalogue: ");
            System.out.println("1. SHOW AVAILABLE BOOKS");
            System.out.println("2. ISSUE A BOOK");
            System.out.println("3. RETURN A BOOK");
            System.out.println("4. EXIT");

            System.out.println("Enter your choice: ");
            int choice = inp.nextInt();
            inp.nextLine();

            switch (choice) {
                case 1:
                    Library.showAvailableBooks();
                    break;
                case 2:
                    issueNewBook();
                    break;
                case 3:
                    returnBrwBook();
                    break;
                case 4:
                    System.out.println("Exiting the Library !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter valid choice...");

            }
        } while (true);
    }
    private void issueNewBook(){
        System.out.print("Enter the Book ID: ");
        String bkID = inp.nextLine();
        System.out.print("\nEnter the Book Name: ");
        String bkName = inp.nextLine();
        System.out.print("\nEnter today's date: ");
        String bkIssueDate = inp.nextLine();
        System.out.print("\nEnter return date: ");
        String bkReturnDate = inp.nextLine();
        // this will go inside the function of Library and update
        // the issuedBooks and availBooks sections
        Library.issueBook(bkID,bkName,bkIssueDate,bkReturnDate);
        // after this issueBook
        // that issued Book should be gone from the available books section
    }
    private void returnBrwBook(){
        System.out.print("Enter the Book ID: ");
        String bkID = inp.nextLine();
        System.out.print("\nEnter the Book Name: ");
        String bkName = inp.nextLine();
        System.out.print("\nEnter issued date: ");
        String bkIssueDate = inp.nextLine();
        System.out.print("\nEnter today's date: ");
        String bkReturnDate = inp.nextLine();
        Library.returnBook(bkID,bkName,bkIssueDate,bkReturnDate);
    }
}
public class Task11 {
    public static void main(String[] args) {
        Library.availBooks = new ArrayList<>();
        Library.issuedBooks = new ArrayList<>();
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.openLibrary();
    }
}