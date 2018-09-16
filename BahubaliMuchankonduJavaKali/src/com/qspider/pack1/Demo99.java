package com.qspider.pack1;

public class Demo99 {

	public static void main(String[] args) {
		String s1="Hellollo";
		System.out.println(s1.length());
		System.out.println(s1.concat("Hello"));
		System.out.println(s1);
		
		String s2=new String();
		System.out.println(s2);
		System.out.println(s2.isEmpty());
		s2=s2.concat("Bangalore");
		System.out.println(s2.isEmpty());
		
		System.out.println(s1.contains("Deve"));
		s1.equals(s2);
		s1.equals(null);
		s1.equals("Hello");
		s1.equals(new String("Hello"));

	}

}
