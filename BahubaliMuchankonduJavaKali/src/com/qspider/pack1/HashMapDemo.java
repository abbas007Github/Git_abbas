package com.qspider.pack1;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Hydrogen");
		hm.put(2, "Helium");
		hm.put(3, "Lithium");
		hm.put(4, "Berilium");
		hm.put(34,  "Selenium");
		hm.put(null, "Selenium");
		
		hm.put(null, "Gilenium");
		hm.put(34, "Beeranium");
		hm.put(54, "Selenium");
		hm.put(55, "Selenium");
		
		System.out.println(lhs.getClass().getName());
		
		HashMap hm1 = new HashMap();
		hm1.put("ind", "India");
		hm1.put("jpn", "Japan");
		hm1.put("aus", "Australia");
		
		System.out.println(hm1);
		
	}

}
