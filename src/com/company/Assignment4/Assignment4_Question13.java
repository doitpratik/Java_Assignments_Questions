/*
Take as input str, a string. Write a recursive function which returns a new string
in which all duplicate consecutive characters are removed. E.g. for “heeeello”
return “helo”.
*/
package com.company.Assignment4;

public class Assignment4_Question13 {
    public static void main(String[] args) {
        String str = "heeellllo";
        StringBuilder strb = new StringBuilder(str);
        int start=0,end=start+1;
        similar_Del_Prob(strb, start, end);
        System.out.println(strb);
    }
    private static void similar_Del_Prob(StringBuilder strb, int start, int end) {
        if(start > strb.length()-2){
            return;
        }
        if(strb.charAt(start) == strb.charAt(end)){
            strb.deleteCharAt(end);
        }
        similar_Del_Prob(strb,start+1,end+1);
        similar_Del_Prob(strb,start+1,end+1);

    }
}
