package com.codegnan.controlstatements;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		System.out.println("Multiplication table : "+number);
		for(int i=1;i<=20;i++) {
			System.out.println(number + "*" + i + "=" + (number * i));	
		}
		scanner.close();
	}

}
