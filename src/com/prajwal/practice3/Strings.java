package com.prajwal.practice3;

public class Strings {
    public static void main(String[] args) {
        String name ="Prajwal";
        System.out.println(name.length());
        //returns a new String with all the ch -> in lower case
        System.out.println(name.toLowerCase());
        //returns a new String with all the ch -> in upper case
        System.out.println(name.toUpperCase());
        String fname = "   rajawajwNal         ";
        //leading and trailing whitespaces are removed
        System.out.println(fname.trim());
        // last index is not picked
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('a','4'));
        System.out.println(name.replace("raj","kal"));
        if (name.startsWith("Pra")){
            System.out.println("starting correct");
        }
        if (name.endsWith("wal")) {
            System.out.println("ends correct");
        }
        System.out.println(name.indexOf('a'));
        System.out.println(name.charAt(2));
    }
}
