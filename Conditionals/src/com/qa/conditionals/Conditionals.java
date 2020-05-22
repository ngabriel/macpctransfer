package com.qa.conditionals;

public class Conditionals {

	public static void main(String[] args) {
		System.out.println(input(1, 2, true));
		System.out.println(input(3, 3, false));
		System.out.println(input(1, 1, true));
	}
	
	public static int input(int num1, int num2, boolean addOrMultiply) {
		// if num1 or num2 is even then return 0
		if ( num1 % 2 == 0 || num2 % 2 == 0) {
			return 0;
		}
		
		if ( addOrMultiply ) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
}
