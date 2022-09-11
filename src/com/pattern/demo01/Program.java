package com.pattern.demo01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		for(int i=1 ;i<=n;i++) {
			for(int j=1 ;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}

//Enter n :
//5
//1
//12
//123
//1234
//12345