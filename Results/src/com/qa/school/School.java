package com.qa.school;

public class School {

	static int physics = 9;
	static int chemistry = 9;
	static int biology = 90; 
	static int total = physics + chemistry + biology;
	static double percentage = ((double) total) / 450 * 100;
	
	public static void main(String[] args) {
		displayResults();
		displayPercentage();
	}
	
	public static void displayResults() {
		System.out.println("Physics mark: " + physics);
		System.out.println("Chemistry mark: " + chemistry);
		System.out.println("Biology mark: " + biology);
		System.out.println("Total: " + total);
	}
	
	public static void displayPercentage() {
		System.out.println("Your overall percentage is: " + Math.round(percentage) + "%");
		int failed = 0;
		if ( physics < 90 ) {
			System.out.println("You failed Physics");
			failed = failed + 1;
		} 
		
		if ( chemistry < 90 ) {
			System.out.println("You failed Chemistry");
			failed = failed + 1;
		} 
		
		if ( biology < 90 ) {
			System.out.println("You failed Biology");
			failed = failed + 1;
		} 
		
		
		if ( failed == 0 ) {
			System.out.println("You passed");
		} else if ( failed == 1 ) {
			System.out.println("You are a disappointment");
		} else if ( failed == 2 ) {
			System.out.println("You are a disappointment, to yourself and your parents");
		} else if ( failed == 3 ) {
			System.out.println("You are a disappointment, to yourself and your parents, and to your neighbours");
		}
	}
	
	
}
