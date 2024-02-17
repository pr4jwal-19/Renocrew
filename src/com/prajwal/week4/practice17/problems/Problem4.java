package com.prajwal.week4.practice17.problems;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Problem4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Using time Api : ");
        System.out.println(time);
        DateTimeFormatter dtF = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println("Using time API and formatter : ");
        String vakt = time.format(dtF);
        System.out.println(vakt);
    }
}
