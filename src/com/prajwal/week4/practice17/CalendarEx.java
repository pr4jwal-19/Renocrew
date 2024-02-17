package com.prajwal.week4.practice17;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone());
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Moscow"));
        System.out.println(calendar1.getTimeZone().getID());
        System.out.println(calendar1.getTime());
    }
}
