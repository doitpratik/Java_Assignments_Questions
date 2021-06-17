/*
Write a recursive function for Selection Sort. (Using no loops)
*/
package com.company.Assignment4;

import java.util.Arrays;

public class Assignment4_Question8 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SelectionSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void SelectionSort(int[] arr, int i, int end) {
        if(i > arr.length-1){
            return;
        }
            int max = maxIndex(arr, 0, end);
            swap(arr, max, end-1);

        SelectionSort(arr, i+1, arr.length-i);
    }

    private static int maxIndex(int[] arr, int num, int j) {
        int max = num;
        for (int k = num+1; k < j; k++) {
            if(arr[max] < arr[k]){
                max = k;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
