package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.print("Please enter a fruit ");
	Scanner in = new Scanner (System.in);
//	String fruit = in.next();
//
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("Sweet Juicy Fruit");
//                break;
//            case "Banana":
//                System.out.println("Long yellow seedless fruit");
//                break;
//            case "grapes":
//                System.out.println("Tiny Juicy Fruit");
//                break;
//            default:
//                System.out.println("Please Enter a valid fruit");
//                break;
//
//        }
        System.out.print("Enter any number ");
        int day = in.nextInt();
//        switch (day){
//
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            case 7:
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("Please enter a valid number");
//        }

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Please enter a valid number");
        }
    }
}
