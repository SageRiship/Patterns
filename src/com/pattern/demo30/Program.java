package com.pattern.demo30;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// V
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
//		int n = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i-j==0 || i+j==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}

}
//*       *
//*     * 
// *   *  
//  * *   
//   *    
