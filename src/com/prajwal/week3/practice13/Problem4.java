package com.prajwal.week3.practice13;

import com.prajwal.week3.practice13.folder.folderl1.folderl2.Problem3;

class EkClass extends Problem3 {
    void printNums(){
        System.out.println(proInt);
        //System.out.println(defInt);
    }
}
public class Problem4 {
    public static void main(String[] args) {
        EkClass ekClass = new EkClass();
        ekClass.printNums();
    }
}
