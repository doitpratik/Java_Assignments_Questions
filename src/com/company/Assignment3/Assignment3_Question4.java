/*
Take as input a 2-D array. Print it in spiral form anti-clockwise.
Input: 4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Output: 11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23
*/
package com.company.Assignment3;

public class Assignment3_Question4 {
    public static void main(String[] args) {
        int[][] arring = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int[][] arring1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralform_Reverse(arring, 0,arring.length-1, 0, arring[0].length-1);
    }

    private static void spiralform_Reverse(int[][] arring, int row_start, int row_end, int col_start, int col_end) {
        if(row_start >= row_end || col_start >=col_end) return;
        //this is first row printing, after above base  condtion has became false
        for (int i = row_start; i <= row_end ; i++) {
            System.out.print(arring[i][col_start]+" ");
        }
        //this is second loop after execution of first which will print the whole col
        for (int i = col_start+1; i <= col_end ; i++) {
            System.out.print(arring[row_end][i]+" ");

        }
        //this if loop checks if the column which is taken on different col
        if((col_end) != col_start){
            for (int i = row_end-1; i >= row_start ; i--) {
                System.out.print(arring[i][col_end]+" ");
            }
        }
        //this if loop checks if the column which is taken on different row
        if ((row_end) != row_start) {
            for (int i = col_end-1; i > col_start ; i--) {
                System.out.print(arring[row_start][i]+" ");
            }
        }
        spiralform_Reverse(arring, row_start+1,row_end-1, col_start+1, col_end-1);
    }
}
