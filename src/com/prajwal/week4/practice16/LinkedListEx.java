package com.prajwal.week4.practice16;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(12);
        l1.add(24);
        l1.add(36);
        l1.add(48);
        l1.add(60);
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        System.out.println("LinkedList 1: "+l1);
        System.out.println("LinkedList 2: "+l2);
        l2.addLast(55);
        l1.addFirst(6);
        System.out.println("LinkedList 1 after adding "+l1.getFirst()+" : "+l1);
        System.out.println("LinkedList 2 after adding  "+l2.getLast()+" : "+l2);

        if (!l2.contains(24)){
            System.out.println("Checking for 24 in l2...."+l2.add(24));
        }
        System.out.println("24 is at the index: "+l2.indexOf(24));

        l1.addAll(0,l2);
        System.out.println("LinkedList1 after adding LinkedList2 to it - "+l1);

        l1.removeFirst();
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        l1.clear();
        System.out.println(l1);
    }
}
