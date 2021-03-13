/*
Write a function to convert decimal numbers into octal format.
For eg: 453 -> 705
*/
package com.company.Assignment2;

import java.util.Scanner;

public class Assignment2_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        int a = 80;
        decimaltoOctal(a);
    }

    private static void decimaltoOctal(int a) {
        int place = 1, res = 0;
        while(a > 0){
            int mod = a % 8;
            res = res + (mod * place);
            place *= 10;
            a /= 8;
        }
        System.out.println(res);
    }
}
