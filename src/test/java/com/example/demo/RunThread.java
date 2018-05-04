package com.example.demo;

public class RunThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 不共享数据
		 */
		// MyThread t = new MyThread("A");
		// MyThread t1 = new MyThread("B");
		// MyThread t2 = new MyThread("C");
		// t.start();
		// t1.start();
		// t2.start();

		/*
		 * 共享数据
		 */
		MyThread mt = new MyThread();

		Thread t = new Thread(mt, "A");
		Thread t1 = new Thread(mt, "B");
		Thread t2 = new Thread(mt, "C");
		Thread t3 = new Thread(mt, "D");
		Thread t4 = new Thread(mt, "E");

		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
