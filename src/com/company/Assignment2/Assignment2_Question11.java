/*
Write a program sort an array that contains only 0’s & 1’s
For eg: {1,0,1,1,1,0,0,0,1,0,0,1,1}
Ans: {0,0,0,0,0,0,1,1,1,1,1,1,1}
*/
package com.company.Assignment2;

import java.util.Arrays;
public class Assignment2_Question11 {
    public static void main(String[] args) {
        int[] a = {0,1,1,0,0,1,0} ;
        countsorting(a);
        System.out.println(Arrays.toString(a));
    }

    private static void countsorting(int[] a) {
        int ind=0;
        for (int i=0;i < a.length; i++){
            if(a[i]==0){
                swaping(a, i, ind);
                ind++;
            }
        }

    }

    private static void swaping(int[] a, int i, int ind) {
        int t = a[i];
        a[i] = a[ind];
        a[ind] = t;
    }


}
