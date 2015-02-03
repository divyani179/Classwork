package com.test;

 class Mythread  extends Thread implements Runnable{

	 public Mythread(){
		Thread t=new Thread(this);
		Thread t1=new Thread(this);
		t.start();
		t1.start();
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runn!");
	}
	
}
public class Syncthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread my=new Mythread();
    Thread t=new Thread(my);
    t.start();
	}

}
