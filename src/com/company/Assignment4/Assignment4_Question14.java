/*
Take as input str, a string. The string is a mathematical expression. Eg: “[a + {b +
(c+d) + e} + f]”. Write a recursive function which checks if the brackets are
balanced or not.
*/
package com.company.Assignment4;

public class Assignment4_Question14 {
    public static void main(String[] args) {
        String str = "[a + {b + (c+d) + e} + f";
        StringBuilder str2 = new StringBuilder(str);
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '[' || str2.charAt(i) == '{' || str2.charAt(i) == '(' || str2.charAt(i) == ')' || str2.charAt(i) == '}' || str2.charAt(i) == ']') {
                char st = str2.charAt(i);
                str3.append(st);
            }
        }
        int start =0, end = str3.length()-1;
        check_Valid(str3, start,end);
    }

    private static void check_Valid(StringBuilder str3, int start, int end) {
        if (start >= end){
            System.out.println("BALANCED");
            return;
        }
        if((str3.charAt(start)=='[' && str3.charAt(end)==']') || (str3.charAt(start)=='{' && str3.charAt(end)=='}') || (str3.charAt(start)=='(' && str3.charAt(end)==')')){
            check_Valid(str3, start+1, end-1);
        }
        else{
            System.out.println("NOT BALANCED");
            return;
        }
    }
}