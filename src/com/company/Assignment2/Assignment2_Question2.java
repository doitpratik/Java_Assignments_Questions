/*
Write a program that takes two numbers ‘n1’ & ‘n2’ and a character ‘ch’ as input.
- If ch = ‘*’ returns multiplication of the numbers
- If ch = ‘/’ returns quotient after division of the numbers
- If ch = ‘%’ returns remainder after division of the numbers
- If ch = ‘+’ returns addition of the numbers
- If ch = ‘-’ returns subtraction of the numbers
*/
package com.company.Assignment2;

import java.util.Scanner;

public class Assignment2_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char ch = sc.next().charAt(0);
        finalresult(n1,n2,ch);
    }

    private static void finalresult(int n1, int n2, char ch) {
        if(ch == '*'){
            System.out.println(n1 * n2);
        } else if(ch == '/'){
            System.out.println(n1 / n2);
        } else if(ch == '%'){
            System.out.println(n1 % n2);
        } else if (ch == '+') {
            System.out.println(n1 + n2);
        } else if (ch == '-') {
            System.out.println(n1 - n2);
        }

    }
}
