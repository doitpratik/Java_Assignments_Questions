/*Write the pseudocode & a program to calculate the simple interest
based on the inputs(amount, rate, time) provided by the user.
Note: Time must be in year format.*/
package com.company.Assignment1;

import java.util.Scanner;

public class Assignment1_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(SimpleInterest(principle, rate, time));
    }
    public static int SimpleInterest(int principle, int rate, int time){
        int simple_int = (principle * rate * time)/100;
        return simple_int;
    }
}
