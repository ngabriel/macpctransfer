package com.qa.listing;

import java.util.ArrayList;

public class UsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<String>();
		
		System.out.println(shoppingList.size());
		
		shoppingList.add("Banana");
		shoppingList.add("Orange");
		shoppingList.add("Pear");
		shoppingList.add("Apple");
		
		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i));
			if ( shoppingList.get(i).equals("Orange") ) {
				shoppingList.remove(i);
			}
		}
		
		System.out.println("--------");
		
		for (String item : shoppingList) {
			System.out.println(item);
		}
	}
}
