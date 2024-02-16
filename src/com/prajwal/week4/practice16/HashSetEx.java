package com.prajwal.week4.practice16;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(6,0.5f);
        hashSet.add(12);
        hashSet.add(21);
        hashSet.add(34);
        hashSet.add(44);
        System.out.println("Unordered Collection (HashSet) : "+hashSet);
        System.out.println("Size: "+hashSet.size());
        if (hashSet.contains(34)){
            System.out.println("Elem present");
            int hc = hashSet.hashCode();
            System.out.println("Hash Code for this set: "+hc);
        }
    }
}
