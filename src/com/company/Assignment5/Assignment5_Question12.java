/*
You are given an n*n sudoku grid (n is a multiple of 3). Solve the sudoku using
backtracking and print the solution.
E.g: ​ 9                            Output:
{5, 3, 0, 0, 7, 0, 0, 0, 0},            [5, 3, 4, 6, 7, 8, 9, 1, 2]
{6, 0, 0, 1, 9, 5, 0, 0, 0},            [6, 7, 2, 1, 9, 5, 3, 4, 8]
{0, 9, 8, 0, 0, 0, 0, 6, 0},            [1, 9, 8, 3, 4, 2, 5, 6, 7]
{8, 0, 0, 0, 6, 0, 0, 0, 3},            [8, 5, 9, 7, 6, 1, 4, 2, 3]
{4, 0, 0, 8, 0, 3, 0, 0, 1},            [4, 2, 6, 8, 5, 3, 7, 9, 1]
{7, 0, 0, 0, 2, 0, 0, 0, 6},            [7, 1, 3, 9, 2, 4, 8, 5, 6]
{0, 6, 0, 0, 0, 0, 2, 8, 0},            [9, 6, 1, 5, 3, 7, 2, 8, 4]
{0, 0, 0, 4, 1, 9, 0, 0, 5},            [2, 8, 7, 4, 1, 9, 6, 3, 5]
{0, 0, 0, 0, 8, 0, 0, 7, 9}             [3, 4, 5, 2, 8, 6, 1, 7, 9]
*/
package com.company.Assignment5;

import java.util.Arrays;

public class Assignment5_Question12 {
    public static void main(String[] args) {
        int[][] sudoku = {  {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}  };
        solve(sudoku,0,0);

    }
    public static void solve(int[][] sudoku, int row, int col){
        if(row == 9){
            for(int[] rowSudoku : sudoku){
                System.out.println(Arrays.toString(rowSudoku));
            }
            return;
        }
        if(col == 9){
            solve(sudoku, row+1, 0);
            return;
        }
        if(sudoku[row][col] !=0) {
            solve(sudoku, row, col + 1);
        }else{
            for (int val = 1; val <= 9; val++) {
                if(isSafe(sudoku, row, col, val)){
                    sudoku[row][col] = val;
                    solve(sudoku, row, col+1);
                    sudoku[row][col] = 0;
                }
            }
        }

    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int val) {
        for (int r = 0; r < 9; r++) {
            if(sudoku[r][col] == val){
                return false;
            }
        }
        for (int c = 0; c < 9; c++) {
            if(sudoku[row][c] == val){
                return false;
            }
        }
        int box_R = (row/3)*3;
        int box_C = (col/3)*3;
        for (int r = box_R; r < box_R+3; r++) {
            for (int c = box_C; c < box_C+3; c++) {
                if(sudoku[r][c] == val){
                    return false;
                }
            }
        }
        return true;
    }
}
