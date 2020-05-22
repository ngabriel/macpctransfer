package com.qa.firstproject;

public class Runner {
	
	public static int age = 25;
	
	public static void main(String[] args) {
		addToAge();
		addToAge();
		addToAge();
		addToAge();		
		addToAge();
		
		System.out.println(age);
	}
	
	public static void addToAge() {
		age = age + 1;
	}

}
