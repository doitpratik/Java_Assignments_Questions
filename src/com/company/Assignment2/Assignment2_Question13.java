package com.company.Assignment2;

import java.util.Arrays;

public class Assignment2_Question13 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int start = 0, end=nums.length-1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int start, int end) {
        int t = nums[start];
        nums[start] = nums[end];
        nums[end] = t;
    }


}
