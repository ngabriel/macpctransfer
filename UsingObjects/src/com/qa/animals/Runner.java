package com.qa.animals;

public class Runner {

	public static void main(String[] args) {
		Cat mya = new Cat();
		mya.decibels = 100;
		mya.eating = false;
		mya.furColor = "grey";
		
		mya.getDirty();
		System.out.println(mya.furColor);
		
				
		Cat jack = new Cat();
		jack.decibels = 1;
		jack.eating = true;
		jack.furColor = "White with black spots";
	}
	
	public static Cat makeKittens() {
		return new Cat();
	}
	
}
