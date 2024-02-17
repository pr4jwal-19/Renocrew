package com.prajwal.week4.practice17.task17;

import java.util.ArrayList;

public class Task17 {
    public static void main(String[] args) {
        /*
                Library-Management-System -> capable of issuing books to registered students
                Books-> Book ID, Book Name, Book Author, Issued to, Issued on
                User -> addBooks(), issueBook(), returnBook() (issued)
                Assume -> all users are registered with iD & name in central dB

         */

        LMS lms = new LMS();
        lms.startLibrarySystem();


    }
}

