package com.exceptions;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=Integer.parseInt(args[0]);
try
{
Bank b=new Bank();
b.withdraw(x);
System.out.println("amount withdrawn success");
}
catch(Exception e){
	System.out.println("tech error");
}
System.out.println("bye");

	}

}
class Bank{
	void withdraw(int x){
		try{
		System.out.println("in server");
		int b=x/0;
		System.out.println("work done");
		}
		/*catch(Exception e){
			System.out.println("error");
		}*/
		finally{
			System.out.println("close db");
			
		}
		System.out.println("server done");
	}
}
