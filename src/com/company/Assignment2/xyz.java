package com.company.Assignment2;


import java.util.Arrays;

import java.util.Scanner;



public class xyz {

    static void subsetSums(int arr[], int n)
    {

        // There are totoal 2^n subsets
        int total = 1 << n;

        // Consider all numbers from 0 to 2^n - 1
        for(int i = 0; i < total; i++)
        {
            System.out.print(i+" ");
            int sum = 0;

            // Consider binary reprsentation of
            // current i to decide which elements
            // to pick.
            for(int j = 0; j < n; j++) {
                System.out.print(j+" ");
                if ((i & (1 << j)) != 0)
                    sum += arr[j];
            }

            // Print sum of picked elements.
            System.out.print("sum"+sum + " ");
        }
    }

    // Driver code
    public static void main(String args[])
    {
   /*     int arr[] = new int[]{ 5, 4, 3 };
        int n = arr.length;

        subsetSums(arr, n);*/
        int n=5;
        int row =0;
        while(row < n-1){
            int col=0;
            while(col < n-1){
                if(col <= row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println(

            );
            row++;
        }
    }
}
