/*Write a program to print even numbers after odd times jump.
E.g: 2, 6, 14, 26, …
2 (then jump 1 even number 4) -> 6
6 (then jump 3 even numbers 8, 10, 12) -> 14
14 (then jump 5 even numbers 16,18,20,22,24) -> 26
*/
package com.company.Assignment1;

import java.util.Scanner;

public class Assignment1_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        OddJump(num);
    }
    public static void OddJump(int num){
        int current, previous=0;
        for(int i = 0;i<=num;i++){
            if(i==0){
                previous= 2;
                System.out.print(2 + "  ");
            }
            else if(i%2==0){
                continue;
            }
            else{
                current = 2 * (i+1) + previous ;
                previous = current;
                System.out.print(current + "  ");
            }
        }

    }
}
/* 2 6 14 26
for (n=0)
print 2
for (n=1)
2*(i+1)+previous
 previous = current;= 6
for (n=2)
continue;
for (n=3)
2(3+1)+previous (8+6)=14
previous = 14;
for (n=4)
continue;
for (n=5)
2(5+1) + previous(12+14) 26
for (n=7)
2(8) + previous; (16+26) 42
*/
