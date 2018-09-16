package com.qspider.pack1;

class Orange
{
	int wt;
	Orange(int wt)
	{
		this.wt=wt;
	}
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		if(this==o)
		{
			return true;
		}
		if(o instanceof Orange)
		{
			return true;
		}
		return false;
	}
}

public class Demo91 {

	public static void main(String[] args) {
		
		Orange m1=new Orange(100);
		Orange m2=new Orange(120);
		Orange m3=new Orange(100);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		
		
	}

}
