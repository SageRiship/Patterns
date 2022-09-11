package com.pattern.demo17;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Note : This is static problem so, we will not take input from user
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
		// int n = sc.nextInt();

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 9; j++) {
				if (i+j==6 || j-i==4) {
					System.out.print("*");
				} else if(i==5){
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
// *     * 
//*********





