package com.pattern.demo26;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fibonacci
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		
		
		for (int i = n; i >= 1; i--) {
			for (int j = i ; j>=1 ;j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
//Enter N : 5
//54321
//4321
//321
//21
//1