package com.prajwal.week4.practice17.problems;

import java.util.Calendar;

public class Problem3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("24-Hr format : "+calendar.get(Calendar.HOUR_OF_DAY)
                +":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
    }
}
