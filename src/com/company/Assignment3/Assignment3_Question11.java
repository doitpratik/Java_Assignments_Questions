package com.company.Assignment3;

import java.util.Scanner;

public class Assignment3_Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] str2 = str.toCharArray();
        int size = str2.length;
        for (int i = 0; i < size; i++) {
            if(str2[i]>=65 && str2[i] <= 90){

                str2[i] = (char)(str2[i]+32);
            }else if(str2[i]>=97 && str2[i] <= 122){
                str2[i] = (char)(str2[i]-32);
            }
        }
        String str3 = String.valueOf(str2);
        System.out.println(str3);
    }
}
