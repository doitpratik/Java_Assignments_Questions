/*
Write a function that accepts a character and prints if it is “Uppercase” or
“Lowercase”
*/
package com.company.Assignment2;

import java.util.Scanner;

public class Assignment2_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        AlphaCase(ch);
    }

    private static void AlphaCase(char ch) {
        if(ch >= 65 && ch <= 90){
            System.out.println("Uppercase");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("Lowercase");
        }else if(ch >= 48 && ch <= 57){
            System.out.println("Not Alphabet");
        }
    }
}
