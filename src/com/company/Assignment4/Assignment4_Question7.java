/*
Write a recursive function for Bubble Sort. (Using no loops)
*/
package com.company.Assignment4;

import java.util.Arrays;

public class Assignment4_Question7 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubblesort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr, int i, int j) {
        if(i >= arr.length-1){
            return;
        }
        bubblesort_internal(arr, i, j);
        bubblesort(arr, i+1, 0);
    }

    private static void bubblesort_internal(int[] arr, int i, int j) {
        if(j >= arr.length-i-1){
            return;
        }else if(arr[j] > arr[j+1]){
            swap(arr, j, j+1);
        }
        bubblesort_internal(arr, i, j+1);
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
