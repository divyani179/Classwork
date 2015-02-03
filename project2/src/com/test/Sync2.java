package com.test;
class Runthread implements Runnable{
	Thread t;
	Loan l;
	int account ;
	String name;
	public Runthread(Loan lo, int account, String name) {
		
		 l=lo;
		this.account = account;
		this.name = name;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello"+name);
		double in=l.calcloan(account);
		System.out.println("your interest is"+in);
		}
	}
public class Sync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("welcome to the net banking");
   
   Loan l=new Loan();
   Runthread s1=new  Runthread(l,100,"div");
   Runthread s2=new  Runthread(l,200,"shiv");
   Runthread s3=new  Runthread(l,678,"sam");
   try{
	   s1.t.join();
	   s2.t.join();
	   s3.t.join();
	   
   }catch(InterruptedException e){
	   e.printStackTrace();
   }
   System.out.println("in main at last");
   
	}

}
class Loan{
	double bal=4000;
	double calcloan(int amount){
		double res=0;
		try{
			bal=bal-amount;
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		return bal;
	}
}
