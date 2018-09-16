package com.qspider.pack1;

import java.util.ArrayList;
import java.util.List;

interface Fruit
{
	
}

class Cherry implements Fruit
{
	public boolean equals(Object o)
	{
		if(o instanceof Cherry)
			return true;
		else
			return false;
	}
}

public class ArrayListDemo1 {
	

	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(true);
		lst.add("Hello");
		lst.add(new String("Bangalore"));
		lst.add(new Cherry());
		lst.add(10);
		Cherry o1=new Cherry();
		lst.add(o1);
		
		System.out.println(lst.size());
		System.out.println(lst.contains(10));
		System.out.println(lst.contains(true));
		System.out.println(lst.contains(o1));
		//false because equals method not overridden
		System.out.println(lst.contains(new Cherry()));

		
		if(lst.get(2) instanceof String)
		{
			System.out.println(((String)lst.get(2)).length());
		}
		System.out.println(lst);
		
		for(int i=0; i<lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}
		
		for(Object o:lst)
			System.out.println(o);
		
		ArrayList<Orange> lst1 = new ArrayList<Orange>();
		ArrayList<Orange> lst2=new ArrayList<>();
		List lst3 = new ArrayList<>();
		List<Integer> lst4 = new ArrayList<>();
		//List<Fruit> lst10=new ArrayList<>();
		
		ArrayList<String> lst5 = new ArrayList<>();
		lst5.add("Anil");
		lst5.add("Sunil");
		lst5.add("Ramesh");
		lst5.add("Suresh");
		
		List<Fruit> lst10=new ArrayList<>();
		lst10.add(new Cherry()); //Object of Fruit interface, Objects of class implementing fruit interface
		for(String o:lst5)
			System.out.println(o);
		
		System.out.println("---------Converting to Object Array------------------");
		
		Object[] obj = lst5.toArray();
		for(Object o:obj)
			System.out.println(o);
		
	}

}
