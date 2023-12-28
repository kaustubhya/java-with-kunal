package com.company;

import java.util.Scanner;

public class Question2ArmstrongNumbers {
// check if a number is an armstrong number or not
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();

    System.out.println(isArmstrong(n));


//       print all the 3 digit armstrong numbers

    for(int i = 100; i < 1000; i++){
        if(isArmstrong(i)){
//            this checks if the number i in the loop is fitting under the armstrong condition method or not
            System.out.print(i + " ");
//             From the output we see that there are only 4 armstrong numbers between [100 and 999]
        }
    }

}
static boolean isArmstrong(int n){
    int original = n;
    int sum = 0;
    while(n > 0){
        int remainder = n % 10;
        n = n /10;
        sum = sum + remainder*remainder*remainder;
    }

    return sum == original;
//    if it is true then the method will return true or else the method will return false
}
}
