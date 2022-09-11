package com.pattern.demo33;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
//		int n= sc.nextInt();

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 15; j++) {
				if ((j >= 4 - i && j <= 4 + i) || (j >= 12 - i && j <= 12 + i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		for(int i=8 ;i>=1;i--) {
			for(int k=i;k<8;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
//  ***     ***  
// *****   ***** 
//******* *******
//* * * * * * * * 
// * * * * * * * 
//  * * * * * * 
//   * * * * * 
//    * * * * 
//     * * * 
//      * * 
//       * 

