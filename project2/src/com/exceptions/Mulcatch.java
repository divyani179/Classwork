package com.exceptions;

public class Mulcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	System.out.println("started");
    String s=args[0];
    System.out.println("got value");
    int y=Integer.parseInt(s);
    System.out.println("value is :"+y);
    int x=25/y;
    System.out.println(x);
    

}catch(NumberFormatException e){
	System.out.println("divide by zero");
}
catch(ArrayIndexOutOfBoundsException e1){
	System.out.println("enter one value");
	
}
catch(Exception e){
	System.out.println("exception occured "+e);
	e.printStackTrace();
}


	}

}
