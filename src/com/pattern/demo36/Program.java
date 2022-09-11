package com.pattern.demo36;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter N : ");
//		int n= sc.nextInt();

		int num=1;
		int diff=0;
		for (int i = 1; i <= 5; i++) {
			if(i%2 != 0) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num+" ");
				num++;
				}

			}else {
				diff =num+i-1;
				for(int j=1;j<=i;j++) {
					System.out.print(diff+" ");
					diff--;
					num++;
				}
			}
			System.out.println();
		}
		
	}

}
//Zigzag
//1 
//3 2 
//4 5 6 
//10 9 8 7 
//11 12 13 14 15 

