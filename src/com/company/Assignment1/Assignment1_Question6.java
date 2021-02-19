/*Write a program to reverse a number (9735 -> 5379)
*/
package com.company.Assignment1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Assignment1_Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(Reverse_Number(n));
    }
    public static int Reverse_Number(int num){
        int rem, reverse_num=0;
        while(num>0){
            rem = num % 10;
            reverse_num = (reverse_num * 10) + rem;
            num /= 10;
        }
        return reverse_num;
    }
}
