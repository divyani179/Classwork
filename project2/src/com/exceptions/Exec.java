package com.exceptions;

public class Exec {

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
    

}catch(Exception e){
	System.out.println("divide by zero");
}
System.out.println("in main after exception occured!");
System.out.println("run time in main");

	}

}
