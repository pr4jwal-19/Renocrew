package com.prajwal.week1.practice3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>,Thanks a lot!";
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= inp.nextLine();
        letter=letter.replace("<|name|>",name);
        System.out.println(letter);
    }
}
