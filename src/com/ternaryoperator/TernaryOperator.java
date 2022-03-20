package com.ternaryoperator;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age=scanner.nextInt();
		String voter=(age>18)?"eligibleforvote":"noteligibileforvote";
		System.out.println(voter);

		//		if (age>18) {
		//			System.out.println("eligibleforvote");
		//		}else {
		//			System.out.println("noteligibileforvote");
		//		}	
		int a=20,b=10,c=30;
		//result holds max of three 
		//numbers
		int result = ((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println(result);
	}
}
