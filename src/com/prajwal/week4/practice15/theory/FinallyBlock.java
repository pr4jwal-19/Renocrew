package com.prajwal.week4.practice15.theory;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Compute fn: "+compute());
    }
    static int compute(){
        try {
            int a = 10;
            int b = 0;
            return a/b;
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up of resources....");
            System.out.println("This block of code will run no matter what....");
        }
        return -1;
    }
}
