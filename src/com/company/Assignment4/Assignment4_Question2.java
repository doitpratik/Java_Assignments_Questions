/*
Take ‘n’ as input and write a recursive function to return the sum of 1 to n.
Eg: for n=5 return 15 (1+2+3+4+5)
*/
package com.company.Assignment4;

import java.util.Scanner;

public class Assignment4_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum_Of_N(n));
    }

    private static int sum_Of_N(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return n+sum_Of_N(n-1);
    }
}
