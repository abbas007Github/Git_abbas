package com.qspider.pack1;
//TreeSet takes Objects of same type only irrespective of we using generics or not. It does 

import java.util.Set;
import java.util.TreeSet;

//Not allow duplicates. It does not allow null. Not only we should have objects of same type
//but also the Objects class should be Comparable (that is it should have implemented Comparable Interface)

class Mango {

}

public class TreeSetDemo {

	public static void main(String[] args) {

		Set set = new TreeSet<>();
		set.add(10);
		//set.add("Hello"); cannot have objects of different types
		set.add(5);
		set.add(25);
		set.add(20);
		set.add(10);
		
		//Set doesnot take null
		//If you have to sort objects of your type like Mango then that class should be
		//implemented comparable interface
		
		
		
	}

}
