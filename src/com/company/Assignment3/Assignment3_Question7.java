/*
There is a group of MMA fighters standing together in a line. Given the value of
their strengths, find the strength of the strongest fighter in continuous sub-groups
of size k.
Input: 5 3
1 3 1 4 5
Output: 3 4 5
*/
package com.company.Assignment3;

import java.util.Scanner;

public class Assignment3_Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        search_max_array(arr, n, k);
    }

    private static void search_max_array(int[] arr, int n, int k) {

        for (int i = 0,j=k; i <= n - k ; i++,j++) {
            int max = arr[0];
            for (int l = i; l < j; l++) {
                if(max < arr[l]){
                    max = arr[l];
                }
            }
            System.out.print(max + " ");
        }
    }
}
