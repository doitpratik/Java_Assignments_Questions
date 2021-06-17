/*
Take as input str, a string. We are concerned with all the possible
ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”,
“98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
a. Write a recursive function which returns the count of ascii-subsequences
for a given string. Print the value returned.
b. Write a recursive function which prints all possible ascii-subsequences for
a given string (void is the return type for function).
Eg: ab
Output: b 98 a ab a98 97 97b 9798
9
*/
package com.company.Assignment4;

public class Assignment4_Question11_a_b {
    public static void main(String[] args) {
        String str = "ab";
        int count =-1;
        subsequence("",str);
        System.out.println();
        System.out.println(subsequence_count("",str));

    }
    private static void subsequence(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.print(processed+"  ");
            return;
        }
        char ch = unprocessed.charAt(0);
        int c = unprocessed.charAt(0);
        c = (char) c;
        unprocessed = unprocessed.substring(1);

        subsequence(processed,unprocessed);
        subsequence(processed+ch, unprocessed);
        subsequence(processed+c, unprocessed);
    }
    //This method for finding subsequence count is basically due to the recursive tree structure formed by subsequence which is 3^N
    private static int subsequence_count(String processed, String unprocessed) {
       if(unprocessed.isEmpty()){

            return 1;
        }
        char ch = unprocessed.charAt(0);
        int c = unprocessed.charAt(0);
        c = (char) c;
        unprocessed = unprocessed.substring(1);
        int count = 0;
        count += subsequence_count(processed,unprocessed);
        count += subsequence_count(processed+ch, unprocessed);
        count += subsequence_count(processed+c, unprocessed);
        return count;
    }
}
