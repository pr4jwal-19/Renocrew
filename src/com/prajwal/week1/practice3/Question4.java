package com.prajwal.week1.practice3;

public class Question4 {
    public static void main(String[] args) {
        String example = "This string contains and   triple spaces";
        if (example.contains("  ")){
            System.out.println(example.indexOf("  "));
        }
        if (example.contains("   ")){
            System.out.println(example.indexOf("   "));
        }
    }
}
