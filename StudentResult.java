package com.codegnan.javafundamentals;
import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = scanner.nextInt();
		String result = marks >= 35 ? "Pass" : "Fail";
		System.out.println(result);
		scanner.close();
	}

}
