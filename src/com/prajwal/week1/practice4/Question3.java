package com.prajwal.week1.practice4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the salary per annum (in lakhs): ");
        float salary = inp.nextFloat();
        float taxCal = calculateTax(salary);
        System.out.println("Tax you need to pay for the salary "+salary+"L is: Rs."+taxCal);

    }
    static float calculateTax(float income){
        float tax = 0.0f;
        if (income<2.5f){
            tax=tax+0;
        } else if (income>=2.5f && income<5.0f) {
            tax=tax+0.05f*(income-2.5f);
        } else if (income>=5.0f && income<10.0f) {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5.0f);
        } else if (income>=10.0f) {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(income-10.0f);
        }
        return tax*100000;
    }
}
