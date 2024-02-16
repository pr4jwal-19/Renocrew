package com.prajwal.week4.practice16;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(12);
        arrayDeque.add(24);
        arrayDeque.add(35);
        System.out.println("Array Deque: "+arrayDeque);
        arrayDeque.addFirst(2);
        arrayDeque.addLast(60);
        System.out.println("Array Deque\n after insertion from first "
                +arrayDeque.getFirst()+" and last "+arrayDeque.getLast()+" : "+arrayDeque);

    }
}
