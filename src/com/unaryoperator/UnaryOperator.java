package com.unaryoperator;

import java.util.Scanner;

public class UnaryOperator {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter The First Number :");
		int numberFirst = scanner.nextInt();
		System.out.println(numberFirst);
		System.out.println(++numberFirst);
		System.out.println(numberFirst++);
		System.out.println(numberFirst);

		System.out.println("Enter Second Number");
		int nuberSecond=scanner.nextInt();
		System.out.println(nuberSecond);
		System.out.println(+nuberSecond);
		System.out.println(-nuberSecond);
		System.out.println(~numberFirst);

	}
}
