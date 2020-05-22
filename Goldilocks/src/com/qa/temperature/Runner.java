package com.qa.temperature;

public class Runner {

	public static void main(String[] args) {
		int temp = 50;
		
		if ( temp > 25 ) {
			System.out.println("Too hot!");
			if ( temp > 40 ) {
				System.out.println("Stay inside!");
			}
		} else if ( temp < 15 ){
			System.out.println("Too cold");			
		} else {
			System.out.println("Just right");
		}
		
	}
}
