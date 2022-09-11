package com.pattern.demo21;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		 int n = sc.nextInt();

		int x=1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}

	}

}
//1
//23
//456
//78910
