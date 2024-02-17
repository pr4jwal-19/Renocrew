package com.prajwal.week4.practice17;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarEx {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        if (cal.isLeapYear(cal.getWeekYear())){
            System.out.println("Yes, "+cal.getWeekYear()+" is a Leap Year !");
        }
        /*
        for (String ids: TimeZone.getAvailableIDs()){
            System.out.println(ids);
        }

         */
        System.out.println("No.of timezones: "+TimeZone.getAvailableIDs().length);
        System.out.println(TimeZone.getDefault());
    }
}
