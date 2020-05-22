package com.qa.flowchartconditionals;

public class FlowchartRunner {

	public static void main(String[] args) {
		int a = 10;
		
		if ( a > 2000 ) {
			System.out.println("A");
			if ( a > 6000 ) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if ( a > 4000 ) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			
		}
	}
}
