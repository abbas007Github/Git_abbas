package com.qspider.pack1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		
		
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		lhs1.add(20);
		lhs1.add(40);
		lhs1.add(60);
		lhs1.addAll(lhs);
		System.out.println(lhs1);

	}

}
