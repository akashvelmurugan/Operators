package com.bitwiseoperator;

public class BitwiseOperator {
	public static void main(String[] args) {

		int a=12;//->00001100
		int b=25;//->00011001


		//AND &
		//1 0 ->0   
		//1 1 ->1
		//0 0 ->0
		//0 1 ->0
		System.out.println(a&b);

		//OR |
		//1 0 ->1   
		//1 1 ->1
		//0 0 ->0
		//0 1 ->1
		System.out.println(a|b);

		//XOR ^
		//1 0 ->1   
		//1 1 ->0
		//0 0 ->0
		//0 1 ->1
		System.out.println(a^b);

		//complement ~
		int c=35;
		System.out.println(~c);
	}
}
