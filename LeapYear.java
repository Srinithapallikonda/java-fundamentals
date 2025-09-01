package com.codegnan.javafundamentals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = scanner.nextInt();
		String result = year%4 ==0 ? "leapyear" : "not leapyear";
		System.out.println(result);
		scanner.close();

	}

}
