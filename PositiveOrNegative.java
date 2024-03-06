package com.If_Else;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("The number is positive ");
		
		}else if(number < 0) {
			System.out.println("The number is negative");
		}else {
			System.out.println("The number is Zero ");
		}
		
		}

}
