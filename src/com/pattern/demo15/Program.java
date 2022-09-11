package com.pattern.demo15;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Note : This is static problem so, we will not take input from user
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
		// int n = sc.nextInt();

		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 6; j++) {
				if (i + j == 3 || j - i == 3) {
					System.out.print("*");
				}else if(i==3 && j%2==0) {
					System.out.print("*");
				}
				else {
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
// * * *  * 



