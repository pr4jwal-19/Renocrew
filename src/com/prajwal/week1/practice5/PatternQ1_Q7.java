package com.prajwal.week1.practice5;

public class PatternQ1_Q7 {
    public static void main(String[] args) {

        // Q1 :
        // printing star pattern
        /*      * * * *
                * * *
                * *
                *
         */
        int n = 4;
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Q7 : same pattern using while loop
        System.out.println("Printing the pattern using while: ");
        int nRows  = 4;
        int i = 0;
        while (i<nRows){
            int j = 0;
            while (j<(nRows-i)){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
