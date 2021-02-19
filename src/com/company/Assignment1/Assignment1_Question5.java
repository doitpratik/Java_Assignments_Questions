/*Write a program to count the number of digits in a number.*/
package com.company.Assignment1;

import java.rmi.activation.ActivationSystem;
import java.util.Scanner;

public class Assignment1_Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while(x>0){
            count++;
            x = x/10;

        }
        System.out.println(count);
    }
}
