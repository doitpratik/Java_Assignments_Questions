/*
Take as input a 2-D array. Print it in spiral form clockwise.
Input: 4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Output: 11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32
*/
package com.company.Assignment3;



public class Assignment3_Question5 {
    public static void main(String[] args) {
        int[][] arring = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int[][] arring1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralform_clockwise(arring1, 0,arring.length-1, 0, arring[0].length-1);
    }

    private static void spiralform_clockwise(int[][] arring, int row_start, int row_end, int col_start, int col_end) {
        if(row_start > row_end || col_start >  col_end) return;
        //this is first cols printing, after above base  condtion has became false
        for (int i = col_start; i <= col_end ; i++) {
            System.out.print(arring[row_start][i]+" ");
        }
        //this is second loop after execution of first which will print the whole row
        for (int i = row_start+1; i <= row_end ; i++) {
            System.out.print(arring[i][col_end]+" ");

        }

        //this if loop checks if the column which is taken on different row
        if ((row_end) != row_start) {
            for (int i = col_end-1; i >= col_start ; i--) {
                System.out.print(arring[row_end][i]+" ");
            }
        }

        //this if loop checks if the column which is taken on different col
        if((col_end) != col_start){
            for (int i = row_end-1; i > row_start ; i--) {
                System.out.print(arring[i][col_start]+" ");
            }
        }
        spiralform_clockwise(arring, row_start+1,row_end-1, col_start+1, col_end-1);
    }
}
