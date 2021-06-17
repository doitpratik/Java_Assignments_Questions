/*
Take as input row and column of a rectangular board. The rat starts its journey
from the top left corner and must reach the bottom-right corner to get the cheese.
In one move the rat can move 1 step horizontally (right) or 1 step vertically
(down).
a. Write a recursive function which returns an ArrayList of moves for all valid
paths across the board. Print the value returned.
E.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”,
“VHHV” etc.
*/
package com.company.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment5_Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row1 = sc.nextInt(), col1 = sc.nextInt();
        ArrayList<String> temp  = new ArrayList<>();
        maze(0, 0, "", temp, row1, col1);
        System.out.println(Arrays.deepToString(new ArrayList[]{temp}));
    }

    private static void maze(int row, int col, String pushing, ArrayList<String> temp, int rowlength, int collength) {
        if(row == rowlength-1 && col == collength-1){
            temp.add(pushing);
            return;
        }
        if(col< collength) {
            maze(row, col + 1, pushing + 'h', temp, rowlength, collength);
        }
        if(row < rowlength) {
            maze(row + 1, col, pushing + 'v', temp, rowlength, collength);
        }


        return;
    }
}
