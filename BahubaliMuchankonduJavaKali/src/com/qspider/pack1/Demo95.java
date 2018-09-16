package com.qspider.pack1;

public class Demo95 {

	public static void main(String[] args) {
		String s1="Java";
		String s2=new String("Developer");
		String s3="Java";
		String s4=new String("Developer");
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		
		String s5=new String("Java");
		System.out.println(s1==s5);
	}
}
