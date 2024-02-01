package com.prajwal.week3.practice11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            boolean flag = true;
            do {
                System.out.println("Say my name!");
                String name = inp.nextLine();
                if (name.equals("Heisenberg")) {
                    System.out.println("You're Goddamn Right !");
                    flag = false;
                }
            }
            while (flag);
        }

}
