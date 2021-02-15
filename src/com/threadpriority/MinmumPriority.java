package com.threadpriority;

class Democlass extends Thread{
	public void run() {
		System.out.println("child thread ");
	}
	
}

public class MinmumPriority {
	public static void main(String[] args) {
		
		Democlass t=new Democlass();
		t.setName("Vishal");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(1);
		System.out.println(t.getPriority());
	}
}
