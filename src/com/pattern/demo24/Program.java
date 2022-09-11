package com.pattern.demo24;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j >= 1; j--) {

				System.out.print(j);

			}
			System.out.println();
		}

	}

}
//Enter N : 5
//1
//21
//321
//4321
//54321

