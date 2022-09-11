package com.pattern.demo19;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Note : This is static problem so, we will not take input from user
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
		// int n = sc.nextInt();

		for (int i = 0; i <= 6; i++) {

			for (int j = 0; j <= 6; j++) {
				if ((j == 3 && i >= 0) || (i == 3 && j >= 0) || (j == 0 && i <= 2) || (i == 0 && j >= 4)
						|| (i == 6 && j <= 2) || (j == 6 && i >= 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//*  ****
//*  *   
//*  *   
//*******
//   *  *
//   *  *
//****  * 
