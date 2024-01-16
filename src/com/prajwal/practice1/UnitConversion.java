package com.prajwal.practice1;

import java.util.Scanner;

public class UnitConversion {
    // convert kilometers to miles
    // distance in km / 1.6 => distance in miles
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        double distance= inp.nextDouble();
        double conv = convertUnit(distance);
        String result = String.format("%.2f",conv);
        System.out.println("Distance "+distance +"(km) in miles: "+result+" miles");
    }
    static double convertUnit(double disInKm){
        return disInKm/1.609;
    }
}
