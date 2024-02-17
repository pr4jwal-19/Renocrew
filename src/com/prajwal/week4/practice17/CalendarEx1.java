package com.prajwal.week4.practice17;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println("Day of Week : "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("12-Hr format : "+calendar.get(Calendar.HOUR));
        System.out.println("24-Hr format : "+calendar.get(Calendar.HOUR_OF_DAY)
                +":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
        System.out.println(" "+calendar.get(Calendar.MONTH));
        System.out.println(" "+calendar.get(Calendar.YEAR));
    }
}
