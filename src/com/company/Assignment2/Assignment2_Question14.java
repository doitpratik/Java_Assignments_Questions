/*
Write a program to input an array and a target value, a number. Write a function
which prints all pairs of numbers which sum equals to the target.
For eg: For this array => {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6} and target of 8
Ans: (3,5), (1,7), (2,6), (9,-1)
*/
package com.company.Assignment2;

import java.util.Arrays;

public class Assignment2_Question14 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6};
        Arrays.sort(nums);
        int target = 8;
        Pair_sum(nums, target);
    }

    private static void Pair_sum(int[] nums, int target) {
        int start = 0, end= nums.length-1;

        while(start < end){
            if(nums[start] + nums[end] == target){
                System.out.println("("+nums[start]+","+nums[end]+")");
            }
            if (nums[start] + nums[end] > target){
                end--;
            }else {
                start++;
            }
        }
    }
}
