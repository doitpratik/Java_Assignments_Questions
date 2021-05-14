/*
Take as input a 2-D array. Print it as a vertical wave(Column-wise).
Input: 4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Output: 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14
*/
package com.company.Assignment3;

public class Assignment3_Question1 {
    public static void main(String[] args) {
        int[][] arring = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int[][] arring1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print_HorizontalWave(arring);

    }

    private static void print_HorizontalWave(int[][] arring) {
        for (int i = 0; i < arring[0].length; i++) {
            if(i%2==0){
                for (int j = 0; j < arring.length ; j++) {
                    System.out.print(arring[j][i]+" ");
                }
            }
            else{
                for (int j = arring.length-1; j >=0 ; j--) {
                    System.out.print(arring[j][i]+" ");
                }
            }
        }
    }
}
