package com.threadpriority;

class Democlass1 extends Thread{
	public void run() {
		System.out.println("child thread ");
	}
	
}

public class NormalPriority {
	public static void main(String[] args) {
		
		Democlass t=new Democlass();
		t.setName("Vishal");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(5 );
		System.out.println(t.getPriority());
	}
}