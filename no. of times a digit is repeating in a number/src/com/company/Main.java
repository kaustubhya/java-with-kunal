package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number ");
/*        since I am going to input a very large number, I will get an error if I use int
          therefore, I will use long */
        Scanner in = new Scanner (System.in);
        long number = in.nextLong();
        int count = 0;
        while (number > 0){
            long remainderOrLastDigit  = number % 10;
            if(remainderOrLastDigit == 7){
                count ++;
            }
            number = number / 10;
        }
        System.out.println("The digit 7 in the number " + "is repeating " + count
        + " times");
    }
}
