package com.pattern.demo02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter Value n :");
		int n = sc.nextInt();
		
		for(int i=5 ;i >=1;i--) {
			for(int j=1 ;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}

//Enter Value n :5
//12345
//1234
//123
//12
//1