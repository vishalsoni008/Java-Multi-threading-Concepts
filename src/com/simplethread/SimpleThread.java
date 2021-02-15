package com.simplethread;

class Demo extends Thread {
	public void run() {
		//try {
		for(int i=0;i<5;i++) {
			//Thread.sleep(2000);
			System.out.println("Child thread ");
		}
		/*catch(InterruptedException e) {}
		}*/
	}
}

public class SimpleThread {
	public static void main(String[] args)// throws InterruptedException 
	{
		Demo t=new Demo();
		t.start();
		
		for(int i=0;i<5;i++) {
			//Thread.sleep(2000);
			System.out.println("main thread");
		}
	}
}
