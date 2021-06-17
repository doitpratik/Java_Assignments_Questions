/*
   Write programs to print the following patterns for an input n = 5 :
          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
*/
package com.company.Assignment1;

public class Assignment1_Question7c {
    public static void main(String[] args) {
        Triangular_number_pattern(5);
    }
    public static void Triangular_number_pattern(int num){
        int row=0;
        while(row < num){
            int col=0, colmirror=0, temp=1;
            while(colmirror <= 2*num-1){
                if(col < num-row){
                    System.out.print("  ");
                }
                else {
                    System.out.print(temp+" ");
                    if(colmirror < num){
                        temp++;
                    }else {
                        temp--;
                    }
                }
                if(colmirror < num){
                    col++;
                }else{
                    col--;
                }
                colmirror++;

            }
            System.out.println();
            row++;
        }
    }
}
