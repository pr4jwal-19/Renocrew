package com.prajwal.week4.practice17.problems;

import java.util.Date;

public class Problem2 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Time passed from 1st Jan 1900");
        System.out.println((System.currentTimeMillis())/3600000+":"+
                (System.currentTimeMillis())/60000+":"+
                (System.currentTimeMillis())/1000);

        System.out.println("Current time in 24 hr format - ");
        // these methods are deprecated now
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
    }
}
