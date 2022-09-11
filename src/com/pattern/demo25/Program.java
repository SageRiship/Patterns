package com.pattern.demo25;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fibonacci
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		int x =0;
		int y= 1;
		int z = 0;
		System.out.print(x+" "+y);
		for (int i = 1; i <= n-2; i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.print(" "+z);
			
		}

	}

}
//
//Enter N : 9
//0 1 1 2 3 5 8 13 21
//a
//00
//bbb
//0000
//ccccc
