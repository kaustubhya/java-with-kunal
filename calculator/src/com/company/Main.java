package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        takes input unless we press 'X' or 'x'
        int answer = 0;

        while(true){
//            this while loop condition is always true
            System.out.print("Enter the operator ");
//            takes the operator as char input
            char operator = in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
//                Take input of two numbers
                System.out.println("Enter the numbers ");
                int number1 = in.nextInt();
                int number2 = in.nextInt();

                if (operator == '+') {
                    answer = number1 + number2;
                }
                if (operator == '-') {
                    answer = number1 - number2;
                }
                if (operator == '*') {
                    answer = number1 * number2;
                }
                if (operator == '/') {
                    if (number2 != 0) {
//                        here number1 / 0 (number2) gives not defined answer
                        answer = number1 / number2;
                    }
                }
                if (operator == '%') {
                    answer = number1 % number2;
                }
            }   else if(operator == 'x' || operator == 'X'){
                    break;
                }
                else{
                    System.out.println("Invalid Operator!!!");
                }
                System.out.println(answer);
            }
/*        here we learnt that we can close the while loop, between the if,else if
        and else statements. */
    }
}
