/*
Write a program to reverse a number: 38105 -> 50183
*/
package com.company.Assignment2;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Assignment2_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int num = 38105;
        reversenum(num);
    }

    private static void reversenum(int num) {
        int res = 0, rem = 0;
        while(num > 0){
            rem = num % 10;
            res = (res * 10) + rem;
            num /= 10;
        }
        System.out.println(res);
    }
}
