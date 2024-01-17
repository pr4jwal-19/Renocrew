package com.prajwal.practice3;

public class Question1 {
    public static void main(String[] args) {
        String name = "Prajwal Nakure";
        String lowerName = convertToLowerCase(name);
        System.out.println("Original Name: "+name);
        System.out.println("After conversion: "+lowerName);
        System.out.println("While using inbuilt method: "+name.toLowerCase());
        String name1 = "Monisha";
        name1 = name1.toLowerCase();
        System.out.println(name1);
    }
    static String convertToLowerCase(String inp){
        char[] arr = inp.toCharArray();
        for (int i=0;i< arr.length;i++){
            if (arr[i]>='A'&&arr[i]<='Z'){
                // 97-65 -> a - A
                // e.g. B -> 66 + 32= 98 -> b
                arr[i]=(char) (arr[i]+('a'-'A'));
            }
        }
        return new String(arr);
    }
}
