/*
Write a program to count multiple of 5 in an array. Take the input array from the
user.
For eg: {5, 45, 23, 63, 27, 80, 15, 2, 65, 30}
Ans: 6
*/
package com.company.Assignment2;
import  java.util.Scanner;
public class Assignment2_Question8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x = s.nextInt(), count=0;
        int[] nums_arr = new int[x];
        for (int i=0; i < nums_arr.length; i++){
            nums_arr[i] = s.nextInt();
        }
        for (int i=0; i < nums_arr.length; i++){
            if(nums_arr[i]%5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
