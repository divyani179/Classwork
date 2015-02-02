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

        System.out.println("welcome");

        Mybank b=new Mybank();

        try{
    b.withdraw(2000);

        }
catch(Exception e){

                e.printStackTrace();

        }

System.out.println("completed");

}

}
