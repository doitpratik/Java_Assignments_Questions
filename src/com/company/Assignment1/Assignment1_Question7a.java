/* Write programs to print the following patterns for an input n = 5:
a.  *
    * *
    * * *
    * * * *
    * * * * *
*/
package com.company.Assignment1;

public class Assignment1_Question7a {
    public static void main(String[] args) {
        Triangular_pattern(5);
    }
    public static void Triangular_pattern(int num){
        int row=0;
        while(row < num){
            int col=0;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

}
