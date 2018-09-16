package com.qspider.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Orange11
{
	public Orange11(int i)
	{
		
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("Hello");
		hs.add("Hello");
		hs.add(null);
		hs.add(10);
		hs.add(true);
		hs.add("World");
		hs.add(new Orange11(100));
		hs.add(new Orange11(100));
		hs.add(new Orange11(120));
		hs.add(null);
		hs.add(12);
		hs.add("12");
		
		//Set is not indexed so we donot have get()
		
		System.out.println("--------------Printing all objects using enhanced for loop------");
		for(Object o:hs)
			System.out.println(o);
		
		System.out.println("--------------Printing all objects using iterator-----------");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(20);
		hs2.add(40);
		hs2.add(60);
		
		hs1.addAll(hs2);
		System.out.println(hs1);
		
		
	}

}
