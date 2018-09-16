package com.qspider.pack1;

//When you want to catch an exception and throw another exception, yoiu can chain the first exception to the throwing exception and can rethrow same exception

public class ChaninedException 
{
	public static void print()
	{
		try
		{
			String[] str= {"Hello"};
			System.out.println(str[5]);
		}catch(ArrayIndexOutOfBoundsException a)
		{
			throw new RuntimeException(a);
		}
	}

	public static void main(String[] args) 
	{
	
		try
		{
			print();
		}
		catch(RuntimeException r)
		{
			//throw RuntimeException();
		}

	}


}