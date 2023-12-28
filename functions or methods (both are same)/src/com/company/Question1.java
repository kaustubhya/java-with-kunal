package com.company;

import java.util.Scanner;

public class Question1 {
//    Prime Nos. using functions
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean answer = isPrime(n);
    System.out.println(answer);
}
static boolean isPrime(int n){
    if(n <= 1){
        return false;
    }
    int c = 2;
    while(c * c < n ){
        if(n % c == 0){
            return false;
        }
        c++;
    }
    return c*c > n;
}
}
