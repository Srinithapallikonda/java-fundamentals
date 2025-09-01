package com.codegnan.javafundamentals;

import java.util.Scanner;

public class HourCaluclator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter time in 24hrs format : ");
		int hour=scanner.nextInt();
		String greeting = (hour>=5&&hour<12)? "Good Morning"
				:(hour>=12&&hour<17)? "Good Afternoon"
						:(hour>=17&&hour<22)? "Good Evening"
								:"Good Night";
		System.out.println("time is : "+hour+" and Wish : "+greeting);
		scanner.close();
	}

}
