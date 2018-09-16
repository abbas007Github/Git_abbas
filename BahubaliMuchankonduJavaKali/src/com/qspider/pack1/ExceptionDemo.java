package com.qspider.pack1;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i=20;
		int j;
		try {
			System.out.println("Ïnside try block");
			try {
				System.out.println("Inside Inner try block");
				int z=Integer.parseInt("10");
			}catch(NumberFormatException e){
				System.out.println("Number Format exception");
			}
			j=i/10;
		
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		
		finally
		{
			System.out.println("Finally block");
		}
	}

}
