package com.thread;

import java.util.Scanner;


	 class Exthread1 implements  Runnable {
        @Override
			public void run() {
				// TODO Auto-generated method stub
			
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
			class Runthread{
				
		public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.out.println("main started");
	

		Exthread1 e1=new Exthread1();
		Thread t=new Thread(e1);
	t.setName("name");
	t.setPriority(2);
	t.start();
			
			
				Checker c1=new  Checker();
				for(int i=0;i<5;i++)
				{
					String name1 = Thread.currentThread().getName();
				try{
					c1.greet(name1, i);
					Thread.sleep(100);
				}catch(InterruptedException e){
			   e.printStackTrace();
				}
			}
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("main completed");

		}

			}




