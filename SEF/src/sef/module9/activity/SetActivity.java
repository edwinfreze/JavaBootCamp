package sef.module9.activity;

import java.util.HashSet;
import java.util.Iterator;
//Needs to be completed
import java.util.*;




public class SetActivity {

	public static void main(String[] args) {
		Set nameset = new HashSet();
		nameset.add("Jon");
		nameset.add("Bob");
		nameset.add("Mark");
		nameset.add("Peter");
		nameset.add("Harry");
		
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		
		
		print(nameset);
		//2 - Call print method to print the set passed as its parameter.
		
	}
	
	static void print(Set nameset)
	{
		Iterator i =  nameset.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
}
}
