/*
Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, .... z=26.
Write a recursive function (return type void) to print all possible codes for the
string. E.g: “1123” -> possible codes are aabc, kbc, alc, aaw, kw.
*/
package com.company.Assignment5;

public class Assignment5_Question5 {
    public static void main(String[] args) {
        String str = "1123";

        printalphabets(str,"");
    }

    private static void printalphabets(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        //char code = (char) (Integer.parseInt(String.valueOf(ch),10)  + 'a' -1);
        char code = (char) (ch  + 'a' -'1');
        printalphabets(str.substring(1), ans+code);

        if(str.length()>=2){
            int i = Integer.parseInt(str.substring(0,2),10);
            if(i > 0 && i <=26){
                code = (char) (i + 'a' - 1);
                printalphabets(str.substring(2), ans+code);
            }
        }
    }

}
