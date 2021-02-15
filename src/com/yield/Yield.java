package com.yield;

class Mythread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("child thread");
		}
	}
}

public class Yield {
	public static void main(String[] args) {
		Mythread t=new Mythread();
		t.start();
		
		for(int i=0;i<5;i++) {
			//Thread.yield();
			System.out.println("main thread ");
		}
	}
}
