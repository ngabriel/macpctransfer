package com.qa.iteration;

public class Iterations {

	
	public static void main(String[] args) {
		int a = 0;
		// While we don't know how many iterations we want
		// i.e. for when we take user input and the input must be valid
		while( a < 5 ) {
			System.out.println("I bake a cookie");
			a++;
		}
		
		// FOR when we know how many iterations we want
		// i.e. when i want to eat a known number of cookies
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("I eat a cookie");
		}
		
	}
}
