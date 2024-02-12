package com.prajwal.week4.practice15.theory;

public class Quiz1 {
    public static void main(String[] args) {
        int a = 24;
        int b = 3;
        while (true){
            try {
                System.out.println(a/b);
            } catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for b = "+b);
            }
            b--;
        }
    }
}
