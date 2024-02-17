package com.prajwal.week4.practice17.problems;

import java.util.HashSet;

public class Problem5 {
    public static void main(String[] args) {
        HashSet<Integer> ids = new HashSet<>();
        ids.add(12);
        ids.add(12);
        ids.add(2);
        ids.add(42);
        ids.add(1);
        ids.add(1);
        ids.add(56);
        System.out.println("As you can see , duplicates are ignored : ");
        System.out.println(ids);
    }
}
