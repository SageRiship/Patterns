package com.pattern.demo27;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fibonacci
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		
		
		for (int i = n; i >= 1; i--) {
			for (int j = n ; j>=i ;j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
//Enter N : 5
//5
//54
//543
//5432
//54321