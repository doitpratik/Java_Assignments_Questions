/*
Given an array and a target value, write a recursive function that will return the
last index of the occurrence of that target value. If not present in the array return
-1.
Eg: {3 2 1 8 6 1 3} target = 1
Output: 5
*/
package com.company.Assignment4;

import java.util.Scanner;

public class Assignment4_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ind = -1;
        occurence(arr,0,n,ind,target);
    }

    private static void occurence(int[] arr, int i, int n, int ind, int target) {
        if(i > n-1){
            System.out.println(ind);
            return;
        }
        if(arr[i]== target){
            ind = i;

        }
        occurence(arr, i+1, n, ind,target);
    }
}
