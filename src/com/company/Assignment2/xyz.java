package com.company.Assignment2;


import java.util.Arrays;

import java.util.Scanner;



public class xyz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        str ="";
        for (int i = 0; i < sb.length(); i++) {

            char c = sb.charAt(i);
            int n =(int)c ;
            if(n > 96){
                n = n-32;
                c = (char)n;
                str = str + c;
            } else {

                n = n + 32;
                c = (char)n;
                str = str + c;

            }


        }
        return str;

    }
}
