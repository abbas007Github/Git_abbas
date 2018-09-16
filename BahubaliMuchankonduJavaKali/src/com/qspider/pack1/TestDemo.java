package com.qspider.pack1;

public class TestDemo {

	public static void main(String[] args) {
		String srchword = "Love";
		int index=0;
		int cntr=0;
		int ch='A';
		
		while((index=srchword.indexOf(srchword, index))!=-1)
		{
			cntr++;
			index=index+srchword.length();
		}
		System.out.println(srchword+" has repeated " +cntr +" times");
		String s1="JavaDeveloper";
		
		//Replaces all Occurances
		System.out.println(s1.replaceFirst("e","EEE"));
		System.out.println(s1.replace("e", "EEE"));
		System.out.println(s1.replaceAll("e", "EEE"));
		//Fetching a char from String
//		System.out.println(s1.charAt(4));
//		
//		//Printing all the chars from a String
//		for(int i=0; i<=s1.length()-1; i++)
//		{
//			System.out.print(s1.charAt(i));
//		}
//		System.out.println();
//		System.out.println("----------Printing in Reverse-----------------");
//		
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			System.out.print(s1.charAt(i));
//		}
//		System.out.println();
//		System.out.println("----------Reversing String ---------------");
//		String str2="";
//		for(int i=s1.length()-1; i>=0;i--)
//			str2=str2+s1.charAt(i);
//		
//		System.out.println(str2);
//		
//		System.out.println(s1.startsWith("Java"));
//		System.out.println(s1.endsWith("Mava"));
//		System.out.println(s1.contains("Deve"));
//		System.out.println("-------------------");
//		System.out.println("BAbababababa".compareTo("BAbabababaBA"));
//		
//		System.out.println(s1=s1.toUpperCase());
//		System.out.println(s1=s1.toLowerCase());
//		System.out.println(s1);
//		
//		System.out.println("Sum of 4 and 5 is " +4+5);
//		System.out.println("Sum of 4 and 5 is " +(4+5));

	}

}
