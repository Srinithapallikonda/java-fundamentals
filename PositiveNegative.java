package com.codegnan.javafundamentals;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		String result = number > 0 ? "Positive" : "Negative";
		System.out.println(result);
		scanner.close();

	}

}
