package com.exceptions;
class Mybank{
	int bal=4000;
	void withdraw(int x) throws Exception{
		try{
			System.out.println("hello");
			int a=10/x;
			
		}
		catch(Exception e){
			System.out.println("caught");
		
		}
	}
}
public class Throwsclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
