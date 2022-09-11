package com.pattern.demo11;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			if(i>=2) {
				for(int p=2;p<=i;p++) {
					System.out.print(p);
				}
			}
			System.out.println();
		}


	}

}
//Enter N : 4
//   1
//  212
// 32123
//4321234
