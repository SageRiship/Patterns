package com.pattern.demo13;

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

			for (int j = 1; j <= i * 2 - 1; j++) {
				if (j % 2 == 0) {
					System.out.print("A");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
//Enter N : 5
//    *
//   *A*
//  *A*A*
// *A*A*A*
//*A*A*A*A*
