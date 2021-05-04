package com.company.Assignment2;

public class Assignment2_Question6 {
    public static void main(String[] args) {
        int a = 4 ,b=8,gcd=1;
        for (int i=1; i <= a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD is "+gcd);
        int lcmm = (a * b)/gcd;
        System.out.println();
        int lcmwadi=lcm_given_divisor(a,b);
        System.out.println("Lcm is "+lcmwadi);
    }
/*
Although simplest method of calculating lcm when gcd is already calculated
lcm = (a*b)/gcd;
*/
    public static int lcm_given_divisor (int a, int b){
        int lcm = 0;
        for (int i=2; i <= a && i<=b;i++){
            if(a%i==0 && b%i==0){
                lcm = i;
                //System.out.println("Lcm of number is "+i);
                break;
            }
        }
        return lcm;

    }
}
