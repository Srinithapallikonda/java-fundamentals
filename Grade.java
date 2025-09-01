package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Marks :");
		int marks = scanner.nextInt();
		char grade = (marks >= 90)? 'o' : (marks >= 80)? 's'
				:(marks >=70)?'a' :(marks >=60)?'b' : (marks >=50)?'c'
						:(marks >=35)?'d':'f';
		System.out.println("Student marks : "+marks+" grade is : "+grade);
		scanner.close();
	}

}
