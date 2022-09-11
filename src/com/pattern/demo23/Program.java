package com.pattern.demo23;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		int c = 97;
		int x = 97;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				c = x++;
			}
			for (int j = 1; j <= i; j++) {

				if (i % 2 == 0) {
					System.out.print(0);
				} else {
					System.out.print((char) c);

				}

			}
			System.out.println();
		}

	}

}
//a
//00
//bbb
//0000
//ccccc
