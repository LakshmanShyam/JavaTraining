package com.cloudgensys.training.exercise1;

public class StringBuilder {
	
	public static void main(String a[])
	{
		java.lang.StringBuilder s = new java.lang.StringBuilder();
		
		for(int i=0;i<=10000;i++)
		{
			s.append(i);
		}
		
		System.out.println(s);
	}

}
