package com.company.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment5_Question3 {
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
        if(row < rowlength && col < collength) {
            maze(row + 1, col+1, pushing + 'd', temp, rowlength, collength);
        }
        if(row < rowlength) {
            maze(row + 1, col, pushing + 'v', temp, rowlength, collength);
        }
        return;
    }
}
