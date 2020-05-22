package com.qa.listing;

public class FlowAndControl {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i++) {
			if ( i == 2 ) {
				continue;
			}
			
			if ( i == 5 ) {
				break;
			}
			
			System.out.println(i);
		}
	}
	
}
