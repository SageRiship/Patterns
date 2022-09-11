package com.pattern.demo37;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n= sc.nextInt();
		int k;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				k = i + j - 1;
				if(k>n) {
					k=k-n;
					
				}
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
//Enter N : 4
//1234
//2341
//3412
//4123
