package com.prajwal.practice2;

import java.util.Scanner;

public class GradeEncryptDecrypt {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char grade= inp.next().charAt(0);
        System.out.println("Encrypted Grade: "+encryptGrade(grade));
        char enGrade = encryptGrade(grade);
        System.out.println("Original grade after decryption: "+decryptGrade(enGrade));
    }
    static char encryptGrade(char grade){
        return (char) (grade+8);
    }
    static char decryptGrade(char enGrade){
        return (char) (enGrade-8);
    }
}
