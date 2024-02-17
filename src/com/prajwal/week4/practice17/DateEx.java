package com.prajwal.week4.practice17;

import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        System.out.println("Returns milliseconds passed from " +
                "1st Jan 1970 - "+System.currentTimeMillis());
        System.out.println("Seconds passed - "+(System.currentTimeMillis())/1000);
        System.out.println("Minutes passed - "+(System.currentTimeMillis())/60000);
        System.out.println("Hours passed - "+(System.currentTimeMillis())/3600000);
        System.out.println("Days passed - "+(System.currentTimeMillis())/86400000);
        System.out.println("Years Passed - "+(System.currentTimeMillis())/31540000000L);

        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(1050701400000L);
        System.out.println("My Birthday - "+date1);
        Date date2 = new Date(103,3,19);
        System.out.println(date2);
        System.out.println("Today's date - "+date.getDate());
        System.out.println("Today's day - "+date.getDay());
        System.out.println("Today's month - "+date.getMonth());
        System.out.println("Today's year from 1900 - "+date.getYear());
    }
}
