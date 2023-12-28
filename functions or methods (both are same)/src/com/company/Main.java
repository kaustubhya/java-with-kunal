package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ans = sum3(20,48);
        System.out.println(ans);

    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;

    }

    static void sum(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Number 1");
        int number1 = in.nextInt();
        System.out.println("Enter Number 2");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is " + sum);
    }
}
