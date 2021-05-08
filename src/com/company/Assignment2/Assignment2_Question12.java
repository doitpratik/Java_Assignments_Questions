/*
Write a program to sort odd and even numbers without taking extra space. (place
even numbers first then all the odd numbers}
For eg: {3,8,5,13,6,12,18,5}
Ans: {8,6,12,18,3,5,13,5}
*/
package com.company.Assignment2;


import java.util.Arrays;

public class Assignment2_Question12 {
    public static void main(String[] args) {
        int[] nums= {3,8,5,13,6,12,18,5};
        sort_Even_Odd(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort_Even_Odd(int[] nums) {
        int even_count = 0, length = nums.length;
        for (int i = 0; i < length; i++) {
            if(nums[i]%2 == 0){
                even_count++;
            }
        }
        int a=0, b =a+1;
        while(a != even_count){
            //this if condition checks if nums[a] is even number then simply get the a pointed to next element
            if(nums[a]%2==0){
                a++;
                b=a+1;
            }
            //this else if condition checks whether the nums[a] is odd and b is less than length(means not ended with array traversing)
            // thenn it will simply swap the element num[a] & nums[b] with each other and increment the b forthe further search
            else if(nums[a]%2 != 0 && b < length){
                swap(nums,a,b);
                b++;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
