package com.company.Assignment4;

public class Assignment4_Question1 {
    public static void main(String[] args) {
        int n = 5, row = 1,col =1, temp=1;
        recursive_pattern(n,row,col,temp);
        /*while(row <= n){
            int col = 1, temp = 1;
            while(col <= row){
                System.out.print(temp + " ");
                temp = temp * (row - col) / (col);
                col++;
            }
            System.out.println();
            row++;
        }*/
    }
    public static void  recursive_pattern(int n,int row ,int col, int temp) {
        if (row > n) {

            return;
        }
        temp = 1;
        while(row >= col){
            System.out.print(temp+" ");
            temp = temp * (row-col) / (col);
            col++;
        }
        System.out.println();
        col = 1;
        recursive_pattern(n, row + 1, col, temp);

    }
}
