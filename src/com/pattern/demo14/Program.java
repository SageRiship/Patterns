package com.pattern.demo14;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Note : This is static problem so, we will not take input from user
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
		// int n = sc.nextInt();

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= 8; j++) {
				if (i + j == 4 || j - i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//    *    
//   * *   
//  *   *  
// *     * 
//*       *

