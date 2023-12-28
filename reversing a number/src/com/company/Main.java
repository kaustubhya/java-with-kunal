package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.print("Enter your number here ");
	Scanner in = new Scanner(System.in);
	int number = in.nextInt();
	int reversedNumber = 0;
	while(number > 0){
	    int lastDigit = number % 10;
	    reversedNumber = reversedNumber * 10 + lastDigit * 1;
	    number /= 10;
    }
        System.out.println("The reversed number is " + reversedNumber);
    }
}
