/*
Take as input str, a string. A “twin” is defined as two instances of a char
separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so
"AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which
recursively counts the number of “twins” in a string. Print the value returned.
Eg: AXAXA
Output: 3
*/
package com.company.Assignment4;

public class Assignment4_Question10 {
    public static void main(String[] args) {
        String str = "AxA";
        char[] arr = str.toCharArray();
        int start =0, end = start+2, count = 0;
        System.out.println(twins_Not(arr,start,end,count));
    }

    private static int twins_Not(char[] arr, int start, int end, int count) {
        if (start > arr.length-3){
            return count;
        }else if(arr[start] == arr[end]){
            count++;
        }
        return twins_Not(arr, start+1,start+3,count);
    }
}
