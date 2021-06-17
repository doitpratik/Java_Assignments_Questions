/*
Take as input ‘n’, the size of a chess board. We are asked to place ‘n’ number of
Knights in it, so that no knight can kill others.
a. Write a recursive function which returns an ArrayList of all valid
configurations.
b. Write a recursive function which prints all valid configurations (return type
for the function will be void).
*/
package com.company.Assignment5;

import java.util.Arrays;

public class Assignment5_Question11 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueens(board,0);
    }

    private static void nQueens(boolean[][] board, int row) {
        if(row == board.length){ // base condition
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board,row,i)){
                board[row][i] = true;
                nQueens(board,row+1);
                board[row][i] = false;
            }
        }

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(col-1>=0 && row-2>=0 && board[row-2][col-1]){
           return false;
        }
        if(col+1 <= board[0].length-1 && row-2>=0 && board[row-2][col+1]){
            return false;
        }
        if(col+2 <= board[0].length-1 && row-1>=0 && board[row-1][col+2]){
            return false;
        }
        if(col-2>=0 && row-1>=0 && board[row-1][col-2]){
            return false;
        }
        return true;
    }
}
