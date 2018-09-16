package com.qspider.pack1;

public class Demo1 {
	public static void main(String[] args) 
	{ 
		int arr[][]= {{3,5,7,9}, {4,2}, {5,7,8,6}, {6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("--------------For each----------------------");
		
		for(int ar[]: arr)
		{
			for(int i: ar)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}	
}
