package com.shiftoperator;
public class ShiftOperator {
	public static void main(String[] args) {

		byte a=127;
		//0000 0010
		//0000 1000
		//right shift
		System.out.println(a>>1);

		//byte b=127;
		//0000 0010
		//0000 0000  
		//leftshift
		System.out.println(a<<2);

		//unsignright operator
		//0000 1000
		int numberA=127;
		int numberB=5;
		System.out.println(numberA>>>2);
		System.out.println(numberB>>>2);
	}
}