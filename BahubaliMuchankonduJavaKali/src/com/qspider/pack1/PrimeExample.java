package com.qspider.pack1;

class PrimeExample
{
   public static void main (String[] args)
   {		
      int limit=100;
      System.out.println("Printing the prime numbers from 1 to"+limit);
      for(int i=1; i<limit; i++)
      {
    	  boolean flag=true;
			for (int j = 2; j < i; j++)    	  {
    		  if(i%j==0)
    		  {
    			  flag=false;
    			  break;
    		  }
    	  }
    	  if(flag)
    	  {
    		  System.out.print(i+" ");
    	  }
      }
   }
}