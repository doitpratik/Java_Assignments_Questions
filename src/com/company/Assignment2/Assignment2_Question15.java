/*
Write a program to input an array and a target value, a number. Write a function
which prints all triplets of numbers which sum equals to the target.
For eg: For this array => {3, 1, 2, 9, 7, 5, -1, 6} and target of 9
Ans: (3,1,5), (3,7,-1), (1,2,6), (1,9,-1)
*/
package com.company.Assignment2;

import java.util.Arrays;

public class Assignment2_Question15 {
    public static void main(String[] args) {
        int[] nums= {3,1,2,9,7,5,-1,6};
        int target = 9;
        Insertion_Sort(nums);
        System.out.println(Arrays.toString(nums));
        boolean b = triple_sum_points(nums, target);
    }

    private static boolean triple_sum_points(int[] nums, int target) {
        int l,r,x = nums.length;


            for (int i = 0; i < nums.length-2; i++) {

                l = i+1;
                r = x - 1;
                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] == target) {
                        System.out.print("(" + nums[i] + "," + nums[l] + "," + nums[r] + ") ");

                    }
                    if (nums[i] + nums[l] + nums[r] > target) {
                        r--;
                    } else {
                        l++;
                    }
                }

            }

          return false;
    }

    private static void Insertion_Sort(int[] nums) {
        for(int i=0; i< nums.length-1;i++){
            for (int j = i+1; j > 0 ; j--) {
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }

}
