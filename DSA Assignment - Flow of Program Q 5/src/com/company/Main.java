package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Enter the values : ");
            Scanner sc = new Scanner(System.in);
            int num;
            int sum = 0;
            boolean check;
            while(check = sc.hasNextInt()){
                num = sc.nextInt();
                sum += num;

            }
            System.out.println(sum);
        }

}
