package com.pattern.demo20;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		 int n = sc.nextInt();
		 Program.fibonaci(n, 0, 1);

		 
		

	}
	
	public static void fibonaci(int n,int a,int b) {
		int c;
		for(int i=2;i<n;i++) {
			c= a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}

