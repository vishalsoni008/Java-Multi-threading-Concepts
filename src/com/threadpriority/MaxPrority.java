package com.threadpriority;

class Demo extends Thread {
	public void run() {
			System.out.println("child Thread");
		}
}

public class MaxPrority {
	public static void main(String[] args) {
		Demo t=new Demo();
		//t.start();
		t.setName("Vishal ");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(10);
		//t.setPriority(MAX_PRORITY);
		System.out.println(t.getPriority());
		
		System.out.println("Parent Thread");
		
	}

}
