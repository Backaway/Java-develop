package com.backaway.threadpool.callable;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	/**
	 * 任务的具体过程，一旦任务传给ExecutorService的submit方法， 则该方法自动在一个线程上执行
	 */
	public String call() throws Exception {
		System.out.println("call()方法被自动调用！！！    " + Thread.currentThread().getName());
		// 该返回结果将被Future的get方法得到
		return "call()方法被自动调用，任务返回的结果是：" + id + "    " + Thread.currentThread().getName();
	}
}
