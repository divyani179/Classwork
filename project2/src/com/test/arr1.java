package com.test;


 class Arr1 {

	public static void main(String[] args) {

		
		
	int i;
	int marks[]=new int[args.length];
	for(i=0;i<args.length;i++)
	{
		marks[i]=Integer.parseInt(args[i]);
	}
	for(i=0;i<args.length;i++)
	{
		
	System.out.println(marks[i]);
	}
	}

}
