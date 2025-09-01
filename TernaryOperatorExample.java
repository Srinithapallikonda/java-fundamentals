package com.codegnan.javafundamentals;
import java.util.Scanner;
public class TernaryOperatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your age : ");
		int age =  scanner.nextInt();
		String result = age >= 18 ? "major" : "minor";
		System.out.println(result);
		scanner.close();
	}
}
