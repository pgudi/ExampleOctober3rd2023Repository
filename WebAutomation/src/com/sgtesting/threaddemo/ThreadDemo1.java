package com.sgtesting.threaddemo;
class MyClass1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("It is an entry point for the Threads!!!");		
	}
	
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		
		MyClass1 job=new MyClass1();
		Thread t1=new Thread(job);
		t1.start();
	}

}
