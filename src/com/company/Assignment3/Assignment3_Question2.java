/*
Take as input a 2-D array. Print it as a horizontal wave(Row-wise).
Input: 4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Output: 11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41
*/
package com.company.Assignment3;

public class Assignment3_Question2 {
    public static void main(String[] args) {
        int[][] arring = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int[][] arring1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print_HorizontalWave(arring);
    }

    private static void print_HorizontalWave(int[][] arring) {
        for (int i = 0; i < arring.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arring[0].length ; j++) {
                    System.out.print(arring[i][j]+" ");
                }
            }
            else{
                for (int j = arring[0].length-1; j >=0 ; j--) {
                    System.out.print(arring[i][j]+" ");
                }
            }
        }
    }
}
