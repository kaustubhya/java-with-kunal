package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int answer = sum2();
        System.out.println(answer);

    }
//     Returning int

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1   ");
        int number1 = in.nextInt();
        System.out.print("Enter Number 2   ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        return sum;

    }
// Returning void and just sout
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1   ");
        int number1 = in.nextInt();
        System.out.print("Enter Number 2   ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is " + sum);
    }
}