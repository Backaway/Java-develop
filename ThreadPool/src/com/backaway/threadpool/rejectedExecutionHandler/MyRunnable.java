package com.backaway.threadpool.rejectedExecutionHandler;

class MyRunnable implements Runnable {
	private String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "正在执行。。。");
			System.out.println(this.name + " is running.");
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}