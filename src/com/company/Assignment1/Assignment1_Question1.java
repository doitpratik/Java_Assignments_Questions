/*Write the pseudocode & a program to input credits of a Code for Cause
Campus leader and then output the badge of the lead on the basis of
the following criteria:
a. 7500 <= credits : Tera leader
b. 6000 <= credits < 7500 : Gega leader
c. 4500 <= credits < 6000 : Mega leader
d. Credits < 4500 : Rising Star*/
package com.company.Assignment1;

import java.util.Scanner;

public class Assignment1_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Credits = sc.nextInt();
        if(Credits>=7500){
            System.out.println("Tera Leader");
        }
        else if (6000<=Credits && Credits<7500){
            System.out.println("Gega Leader");
        }
        else if(4500<= Credits && Credits< 6000){
            System.out.println("Mega Leader");
        }
        else if(Credits < 4500){
            System.out.println("Rising Star");
        }
    }
}
