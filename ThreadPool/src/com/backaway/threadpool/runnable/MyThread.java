package com.backaway.threadpool.runnable;

public class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "正在执行。。。");
	}
}
