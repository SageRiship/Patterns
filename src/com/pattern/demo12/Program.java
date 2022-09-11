package com.pattern.demo12;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <=n ; j++) {
				if(i==j || i+j==n+1) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}


	}

}
//Enter N : 5
//1   5
// 2 4 
//  3  
// 2 4 
//1   5

