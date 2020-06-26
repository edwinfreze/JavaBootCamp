package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sef.module9.sample.MapSample;


public class MapActivity {

		public static void main(String[] args) {
			Map map = new HashMap();
			map.put("1", "Peter");
			map.put("2", "Alex");
			map.put("3", "John");
			map.put("4", "Eddy");
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			
			new MapActivity().print(map);
			
			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		void print(Map map)
		{
			Set keySet = map.keySet();
			
			System.out.println("*************************************");
			System.out.println("Key\tValue");
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			
			System.out.println("*************************************");
		
		}
	}
