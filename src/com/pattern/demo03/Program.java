package com.pattern.demo03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter Value n :");
		int n = sc.nextInt();
		
		for(int i=1 ;i <= n;i++) {
			for(int j=1 ;j<=(i*2)-1;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}

//Enter Value n :4
//1
//123
//12345
//1234567
