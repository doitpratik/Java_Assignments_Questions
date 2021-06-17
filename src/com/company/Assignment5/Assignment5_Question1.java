/*
Take as input str, a string. Write a recursive function which moves all ‘x’ from the
string to its end. Print the value returned
E.g. for “abexexdexed” return “abeedeedxxx”.
*/
package com.company.Assignment5;

import java.util.Scanner;

public class Assignment5_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        StringBuilder str2 = new StringBuilder(str);
        int strlength = str2.length()-1;
        swap_X(str2,0,str2.length()-1, strlength);
        System.out.println(str2);
    }

    private static void swap_X(StringBuilder str2, int i, int end, int strlength) {
        if(i >= strlength-1){
            return;
        }
        if(str2.charAt(i) == 'x'){
            str2.insert(end+1, 'x');
            str2.deleteCharAt(i);
        }
        swap_X(str2,i+1,end, strlength);
    }
}
