package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_problems {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*int num = sc.nextInt();
        int count = 0;
        solve(num, count);*/
        /*int[] encoded = {6,2,7,3};
        int first = 4;
        solveXORED(encoded, first);
        int n = sc.nextInt();
        solveCOuntBit(n);*/
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9},
                };
        int XorSum = 0;
        //System.out.println(subsequence(arr, XorSum, 0));
        //System.out.println(no_Of_Matches(4));
        System.out.println(diagonalSum(arr));
        String s = "1";
        int x=Integer.parseInt(s);
        System.out.println(x);
    }

    private static void solveCOuntBit(int n) {
        int[] arr = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            int count = 0, number=i;
            while(number > 0){
                if((number&1)==1){
                    count++;
                }
                number >>= 1;
            }
            arr[i] = count;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void solveXORED(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i+1] = (arr[i] ^ encoded[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int num, int count) {
        while(num != 0){
            if(num%2 == 1){
                count++;
                num -= 1;
            }else {
                num = (num >> 1);
                count++;
            }
        }
        System.out.println(count);
    }

    private static int subsequence(int[] array, int sum, int n) {
        if(n == array.length){
            return sum;
        }

        int without = subsequence(array, sum,n+1);
        int with = subsequence(array, (sum^array[n]), n+1);
        return without+with;
    }
    private static int no_Of_Matches(int num) {
        if(num == 1){
            return 0;
        }
        int count;
        if(num%2==0){

            count=no_Of_Matches(num/2);
            count += num/2;
        }else{

            count=no_Of_Matches((num-1)/2+1 );
            count += (num-1)/2;
        }


        return count;
    }
    private static int diagonalSum(int[][] mat) {
        int i=0, j1=0,j= mat[0].length-1, sum = 0;
        while(i < mat.length){
            if(j1 < mat[0].length && j >=0){
                if(j1 == j){
                    sum += mat[i][j];
                    j1++;
                    j--;
                }
                else{
                    sum += mat[i][j]+mat[i][j1];
                    j1++;
                    j--;
                }
            }
            i++;
        }
        return sum;
    }

}
