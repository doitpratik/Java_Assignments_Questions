/*
Take an array as input and a target value. Write a recursive function which
returns an array having indices stored in it at which the target value is stored in
the original array.
Eg: {0 4 2 2 1 2 3 4 2} target = 2
Output: {2, 3, 5, 8}
*/
package com.company.Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment4_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        ArrayList<Integer> indices = new ArrayList<>();
        System.out.println(Arrays.toString(occurence(arr,indices,0,n,target)));
    }

    private static Object[] occurence(int[] arr,ArrayList<Integer> indices, int i, int n,  int target) {
        if(i > n-1){
            Object[] array = indices.toArray();
            return array;
        }
        if(arr[i]== target){
            indices.add(i);
        }
        return occurence(arr, indices,i+1, n, target);
    }
}
