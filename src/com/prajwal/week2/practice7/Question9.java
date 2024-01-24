package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter temperature in °C : ");
        float cel = inp.nextFloat();
        System.out.println("Converted temperature in Fahrenheit : "+temperatureConv(cel));
    }
    static float temperatureConv(float tempCel){
        return ((tempCel*9/5.0f)+32.0f);
    }
}
