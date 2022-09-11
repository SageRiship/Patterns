package com.pattern.demo04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter Value n :");
		int n = sc.nextInt();
		
		for(int i=1 ;i<=n;i++) {
			for(int j=1 ;j<=(i*3)-(i*1);j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}

//Enter Value n :5
//12
//1234
//123456
//12345678
//12345678910