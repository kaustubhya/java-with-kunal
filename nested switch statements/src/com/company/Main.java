package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the employee ID ");
        int employeeID = in.nextInt();
        String department = in.next();

        switch(employeeID){
            case 1:
                System.out.println("Kaustubhya Shukla");
                break;
            case 2:
                System.out.println("Saksham Shukla");
                break;
            case 3:
                System.out.println("Employee number 3");
                switch(department){
                    case "IT":
                        System.out.println("Department IT");
                        break;
                    case "Management":
                        System.out.println("Department Management");
                        break;
                    default:
                        System.out.println("Please enter a valid department");

                }
                break;
//                Add a break here to stop the below default statement from executing
                default:
                System.out.println("Please enter a valid employee ID");

        }
    }
}
