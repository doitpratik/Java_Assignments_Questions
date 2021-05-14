/*
Take as input S, a string. Write a function that replaces every odd character with
the character having just higher ascii code and every even character with the
character having just lower ascii code. Print the value returned.
Input: abcg
Output: badf
*/
package com.company.Assignment3;

import java.util.Scanner;

public class Assignment3_Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] str1 = str.toCharArray();
        int size = str1.length;
        for (int i = 0; i < size; i++) {
            if(i%2==0){
                str1[i] = (char)(str1[i]+1);
            }
            else{
                str1[i] = (char)(str1[i]-1);
            }
        }
        String str2 = String.valueOf(str1);
        System.out.println(str2);
    }
}
