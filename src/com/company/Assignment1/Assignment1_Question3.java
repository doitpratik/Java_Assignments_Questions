/* Write the pseudocode & the program to calculate GCD of two numbers.
 GCD - Greatest Common Divisor*/
package com.company.Assignment1;

import java.util.Scanner;

public class Assignment1_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(GCD(num1, num2));
    }
    public static int GCD(int a, int b){
        while(a!=b){
            if(a > b){
                a -=b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
}
