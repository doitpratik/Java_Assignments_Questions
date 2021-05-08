/*
Write a program to count prime numbers in an array.
*/
package com.company.Assignment2;

import java.util.Scanner;

public class Assignment2_Question9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] prime_array = new int[10];
        int count = 0,prime=0;
        for (int i=0; i < prime_array.length; i++){
            prime_array[i] = sc.nextInt();
        }
        for (int i = 0; i < prime_array.length; i++) {
            for (int j = 2; j*j <= prime_array[i]; j++) {
               if( prime_array[i]%j==0 ){
                    count++;
                }
            }
            if(count==0){
                prime++;
            }

        }
        System.out.println(prime);
    }
}
