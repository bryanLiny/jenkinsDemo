package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyThread extends Thread {

	private int count = 5;

	@Override
	public synchronized void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("由" + MyThread.currentThread().getName() + "计算，count=" + count);
		}
	}

	public void listTest() {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		Collections.sort(list);// 排序

		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
			int str = (Integer) iter.next();
			System.out.println(str);
		}
		
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			int str = (Integer) iter.next();
			System.out.println(str);
		}

	}

}
