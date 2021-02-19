/*Write programs to print the following patterns for an input n = 5:
b.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
package com.company.Assignment1;

public class Assignment1_Question7b {
    public static void main(String[] args) {
        Triangular_number_pattern(5);
    }
    public static void Triangular_number_pattern(int num){
        int row=0;
        while(row < num){
            int col=0;
            while(col <= row){
                System.out.print(col+1 + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
