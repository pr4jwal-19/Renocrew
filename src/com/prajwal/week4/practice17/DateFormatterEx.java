package com.prajwal.week4.practice17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime);
        DateTimeFormatter dtF = DateTimeFormatter.ofPattern("dd-MM-yyyy || E || H:m:s a");
        //System.out.println(dtF);
        // dateTime.format(dtF) -> takes the given format and formats the date(LocalDateTime)
        String date = dateTime.format(dtF);
        System.out.println(date);
    }
}
