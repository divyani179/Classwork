package com.thread;

public class Exthread extends Thread {

public Exthread(String name,int id){
	super(name);
	//this.setName(name);
	this.setPriority(id);
	System.out.println(this);
	start();
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Checker c1=new  Checker();
		for(int i=0;i<5;i++)
		{
			String name = Thread.currentThread().getName();
		try{
			c1.greet(name, i);
			Thread.sleep(8000);
		}catch(InterruptedException e){
	   e.printStackTrace();
		}
	}
	
	}
	
}	
	class Threadex{
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main started");
Exthread e1=new Exthread("tom",3);

		Exthread e2=new Exthread("div",4);
		
	
		Checker c1=new  Checker();
		for(int i=0;i<5;i++)
		{
			String name = Thread.currentThread().getName();
		try{
			c1.greet(name, i);
			Thread.sleep(1000);
		}catch(InterruptedException e){
	   e.printStackTrace();
		}
	}

}

	}

class Checker{
	void greet(String name,int i)
{
 System.out.println("welcome"+name);		
System.out.println("iteration "+i);

}
}

