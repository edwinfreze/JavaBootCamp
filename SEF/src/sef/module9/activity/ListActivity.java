package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

import sef.module9.sample.ListSample;

public class ListActivity {

	public static void main(String[] args) {
		List list = new ArrayList();
		 	list.add("Bob");
		    list.add("Carl");
		    list.add("Jon");
		ListActivity obj=new ListActivity();
	    obj.print(list);
		
		//1 - Type code to create a list of names. Use ArrayList.
		
		//2 - Call print method to print the list passed as its parameter.
		
	}
	
	void print(List list)
	{
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
