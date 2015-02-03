package com.thread;

public class Threaddemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=Thread.currentThread();
System.out.println(t);
/*t.setName("po");
t.setPriority(10);
System.out.println("priority is : "+       t.getPriority());
System.out.println(t);
	}
	*/
System.out.println("thread sleeping");
for(int i=1;i<10;i++){
	try{
		System.out.println(i+" *2 = "+i*2);
		Thread.sleep(3000);
	}
	catch(InterruptedException e){
		System.out.println(e);
		
	}
}
System.out.println("main don! ");
	}
}
