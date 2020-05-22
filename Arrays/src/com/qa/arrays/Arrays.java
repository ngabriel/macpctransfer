package com.qa.arrays;

public class Arrays {
	
	public static void main(String[] args) {
		String[] shoppingList = new String[3];
		shoppingList[0] = "Cheese";
		shoppingList[1] = "Milk";
		shoppingList[2] = "Yogurt";
		shoppingList[1] = "Ice Cream";
				
		// Regular for loops
		for ( int i = 0; i < shoppingList.length; i++ ) {
			System.out.println(shoppingList[i]);
		}
		
		System.out.println("-------------");
		
		// For each loop a.k.a Enhanced for loop
		for ( String item : shoppingList ) {
			System.out.println(item);
		}
		
	}
}
