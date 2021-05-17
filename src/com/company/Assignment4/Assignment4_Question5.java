/*
Write a recursive function to reverse an array.
*/
package com.company.Assignment4;

import java.util.Arrays;

public class Assignment4_Question5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int start = 0, end = nums.length-1;
        reverse(nums,start,end );
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        if(start>end){
            return ;
        }
        swap(nums,start,end);
        reverse(nums,start+1,end-1);
    }

    private static void swap(int[] nums, int start, int end) {
        int t = nums[start];
        nums[start] = nums[end];
        nums[end] = t;
    }
}
