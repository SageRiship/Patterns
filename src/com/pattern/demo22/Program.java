package com.pattern.demo22;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		 int n = sc.nextInt();
		 
		 for (int i=1;i<=n;i++) {
			 int k=i;
			 for (int j=1;j<=i;j++) {
				 System.out.print(k);
				 k=k+5-j;
				 
			 }
			 System.out.println();
		 }
		 
		
	}

}

