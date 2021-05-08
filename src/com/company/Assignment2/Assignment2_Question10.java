/*
Write a function to check if an array is sorted or not.
*/
package com.company.Assignment2;

public class Assignment2_Question10 {
    public static void main(String[] args) {
        int[] num = {110,11,12,13,14,15,16,17};
        if(sorting_array(num,num.length) == 1){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
    }

    private static int sorting_array(int[] num, int length) {
        if(length==1 || length == 0){
            return 1;
        }
        if(num[length-1] < num[length-2]){
            return 0;
        }
        return sorting_array(num, length-1);
    }
}
