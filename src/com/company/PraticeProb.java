package com.company;
import java.util.*;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;


public class PraticeProb {
    public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);
        int[] arr = {10,9,0,2,4,1,99,20,21,5};
        //Bubble_Sort(arr);
        //Insertion_Sort(arr);
        //Selection_Sort(arr);
        
        /*int[] first = {1,4,5,6};
        int[] second = {2,3,9};*/
        //System.out.println(Arrays.toString(MergeSort(arr)));
        Quick_Sort(arr, 0, arr.length-1 );
        System.out.println(Arrays.toString(arr));
    }
    //Bubble sort
    public static void Bubble_Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap (int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;

    }

    //Insertion Sort
    public static void Insertion_Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Selection Sort
    public static void Selection_Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = maxIndex(arr , 0, arr.length-i);
            swap(arr, max, arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }

    // Finding maximums index
    public static int maxIndex(int[] arri, int a, int b){
        int max  = a;
        for (int i = a; i < b; i++) {
            if(arri[i] > arri[max]){
                max = i;
            }
        }
        return max;
    }

    // Merge sort code
    // int[] first = {1,4,5};
    // int[] second = {2,3,9};
    public static int[] merge(int[] first, int[] second){
        int i=0, j=0,k=0;
        int[] third  = new int[first.length+second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                third[k++] = first[i++];
            }else{
                third[k++] = second[j++];
            }
        }
        while(j < second.length){
            third[k++] = second[j++];
        }
        while(i < first.length){
            third[k++] = first[i++];
        }
        return third;
    }
   // Merge sort Recursion function
   public static int[] MergeSort(int[] arr){
        if(arr.length < 2){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = Arrays.copyOfRange(arr, 0,mid);
        int[] second = Arrays.copyOfRange(arr, mid, arr.length);
        first = MergeSort(first);
        second = MergeSort(second);
        return merge(first, second);
   } 

   // QuickSort
   public static void Quick_Sort(int[] arr, int start, int end){
        if(start>=end){
            return ;        
        }
        int pos = pivot(arr, start, end);
        Quick_Sort(arr, start, pos-1);
        Quick_Sort(arr, pos+1, end);
   }
   // Placing Pivot element to its correct position
   public static int pivot (int[] arrai, int start, int end){
       int ind = start;
       for (int i = start; i < end; i++) {
            if(arrai[end] > arrai[i]){
                swap(arrai, ind, i);
                ind++;
            }
       }
       swap(arrai, ind, end);
       return ind;
   }
}
