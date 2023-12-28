package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//
//		while (sc.hasNext()) {
//			if (sc.hasNextInt()) {
//				int num = sc.nextInt();
//				sum += num;
//			} else if (sc.next().equals("x")) {
//				break;
//			} else {
//				System.out.println("Enter a valid input");
//			}
//		}
//
//		System.out.println(sum);
//		sc.close();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		result(n);
	}

	static void result(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			result = result + i;
			System.out.print(result + " ");


		}
	}
}


