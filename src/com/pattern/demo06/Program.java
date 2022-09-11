package com.pattern.demo06;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i <=n; i++) {
			for(int j=1 ; j<=i;j++) {
				int val = 96+j;
					System.out.print((char)val);
			}
			System.out.println();
		}
		

	}

}

//Enter N : 5
//a
//ab
//abc
//abcd
//abcde