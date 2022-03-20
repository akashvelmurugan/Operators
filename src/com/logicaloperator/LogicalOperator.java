package com.logicaloperator;

public class LogicalOperator {
	public static void main(String[] args) {
		int a=10, b=20,c=20,d=0;

		System.out.println("a = "+a);
		System.out.println("b = "+a);
		System.out.println("c = "+a);
		System.out.println("d = "+a);

		if (a<b&&b==c) {
			System.out.println("'a' is less than 'b'");
			System.out.println("'b' is greater than 'c'");
		}

		if (a>b&&b>c) {
			System.out.println("'a' is greater");
		}else {
			System.out.println("'a'is not a greatest number");
		}
	}
}
