/*
Take input ‘n’ and then take ‘n’ more integer as input values of 1st array, then
take ‘m’ as input followed by ‘m’ more integer as input values of 2nd array. Write
a function that returns the sum of two arrays as an array.
Input: 4
3 5 0 7
5
9 0 2 8
Output: 1 2 5 3 5
*/
package com.company.Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3_Question6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m =sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int a = arr1.length, b= arr2.length;
        if(n > m){
           int x= adding_array(arr1,arr2, n, m);
            System.out.println(x);
        }
        else{
            int x =adding_array(arr2,arr1, m, n);
            System.out.println(x);
        }

    }

    private static int adding_array(int[] arr1, int[] arr2, int a, int b) {
        //creating new array with maximumsize present between both array
        int[] sum = new int[a];
        int i = a-1, j = b-1, k=a-1, carry =0, presum = 0;
        while(j>=0){
            presum = arr1[i] + arr2[j] + carry;
            sum[k] = (presum % 10);
            carry = presum/10;
            k--;
            i--;
            j--;
        }
        //below while loop is used when one array size is greater than the another
        while(i>=0){
            presum = arr1[i] + carry;
            sum[k] = presum%10;
            carry = presum/10;
            k--;
            i--;
        }
        int ans = 0;
        //below if loop checks if carry = 1;
        if(carry == 1){
            ans = 10;
        }
        //converting array into number
        for (int l = 0; l < sum.length; l++) {
            ans += sum[l];
            ans *= 10;
        }
        return ans/10;//we are writing ans/10 because after ending the final iteration in the for loop ans will get multiplied by 10 which is extra.
    }


}
