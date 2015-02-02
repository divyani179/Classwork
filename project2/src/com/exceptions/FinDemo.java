package com.exceptions;

public class FinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			System.out.println("started");
			String s=args[0];
			System.out.println("got value");
			int y=Integer.parseInt(s);
			System.out.println("value is :"+y);
			int x=25/y;
			System.out.println(x);
			
		}/* catch (NumberFormatException | ArithmeticException |NullPointerException | ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("ghfjf");
			e.printStackTrace();
		}*/
		finally{
			System.out.println("close database in finaally");
			
		}
		System.out.println("div");
	}

	
}
