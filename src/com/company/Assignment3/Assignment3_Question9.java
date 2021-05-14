/*
Take an array as input (can have both positive and negative integers), the task is
to compute the sum of minimum and maximum elements of all sub-array of size
‘k’.
Input: 7 4
2 5 -1 7 -3 -1 -2
Output: 18
Hint: ​ Subarrays of size 4 are :
{2, 5, -1, 7}, min + max = -1 + 7 = 6
{5, -1, 7, -3}, min + max = -3 + 7 = 4
{-1, 7, -3, -1}, min + max = -3 + 7 = 4
{7, -3, -1, -2}, min + max = -3 + 7 = 4
Sum of all min & max = 6 + 4 + 4 + 4 = 18
*/
package com.company.Assignment3;

import java.util.Scanner;

public class Assignment3_Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sub_group = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        counting_maxmin_withTotal(arr, n, sub_group);
    }

    private static void counting_maxmin_withTotal(int[] arr, int n, int sub_group) {
        int total = 0;
        for (int i = 0,j=sub_group; i <=n-sub_group; i++,j++) {
            int max = arr[i], min = arr[i];
            for (int k = i; k < j ; k++) {
                if(max < arr[k]){
                    max = arr[k];
                }
                if(min > arr[k]){
                    min = arr[k];
                }
            }
            total += min + max;
        }
        System.out.println(total);
    }
}
