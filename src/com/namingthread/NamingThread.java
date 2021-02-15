package com.namingthread;

class DemoThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()); // Thread-0
		Thread.currentThread().setName("vishal thread");
		System.out.println(Thread.currentThread().getName()); // vishal thread
	}
}

public class NamingThread {
	public static void main(String[] args) {
		DemoThread t=new DemoThread();
		t.start();
	}

}
