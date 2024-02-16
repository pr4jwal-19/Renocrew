package com.prajwal.week4.practice16;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(12);
        l1.add(24);
        l1.add(32);
        l1.add(45);
        l1.add(78);
        l2.add(11);
        l2.add(23);
        l2.add(44);
        Scanner inp = new Scanner(System.in);
        /*
            for (int i = 0; i < 10;i++){
                System.out.println("Enter the element no. "+i+" :");
                l1.add(i,inp.nextInt());
            }

         */

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        if (!l2.contains(24)){
            System.out.println("24 adding in l2...."+l2.add(24));
        }
        System.out.println(l1.indexOf(12));
        l1.addAll(0,l2);
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.remove(1);
        l1.clear();
        System.out.println(l1);
    }
}
