package com.synchronizedkeyword;

class Display{
	public synchronized void wish(String name) { 
		//without synchronized keyword we get data concurrent 
		// with help of synchronized get data one by one 
		for(int i=0;i<5;i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread {
		Display d;
		String name;
		
		public MyThread(Display d,String name) {
			this.d=d;
			this.name=name;
		}
		public void run() {
			d.wish(name);
		}
}

public class SynchronizedKeyword {
	public static void main(String[] args) {
		Display d1=new Display();
		MyThread t1=new MyThread(d1, "Dhoni");
		MyThread t2=new MyThread(d1, "YuvRaj");
		
		t1.start();
		t2.start();
	}
}
