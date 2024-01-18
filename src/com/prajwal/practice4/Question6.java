package com.prajwal.practice4;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the website: ");
        String website = inp.nextLine();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        } else if (website.endsWith(".in")){
            System.out.println("This is an Indian website.");
        }
    }
}
