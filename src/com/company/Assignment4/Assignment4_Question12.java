/*
Take as input str, a string. Write a recursive function which returns a new string
in which all duplicate consecutive characters are separated by a ‘ - ’. E.g. for
“hello” return “hel-lo”.
*/
package com.company.Assignment4;

import java.util.ArrayList;

public class Assignment4_Question12 {
    public static void main(String[] args) {
        String str = "heeellllo";
        StringBuilder strb = new StringBuilder(str);
        int start=0,end=start+1;
        similar_Dash_Prob(strb, start, end);
        System.out.println(strb);
    }

    private static void similar_Dash_Prob(StringBuilder strb, int start, int end) {
        if(start > strb.length()-2){
            return;
        }
        if(strb.charAt(start) == strb.charAt(end)){
            strb.insert(end,"-");

        }
        similar_Dash_Prob(strb,start+1,end+1);


    }
}
