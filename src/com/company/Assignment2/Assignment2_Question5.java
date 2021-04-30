package com.company.Assignment2;

import java.util.Scanner;

public class Assignment2_Question5 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int index = Integer.toString(num).length();
        int result = 0, total_count = index;
        while(num != 0){
            int rem = num % 10 ;
            result += (int)Math.pow(10,total_count-rem)*index;
            index--;
            num /= 10;
        }
        System.out.println("Reverse No.: "+result);

    }
}
