package com.backaway.threadpool.runnable;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestScheduledThreadPoolExecutor {
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
		exec.scheduleAtFixedRate(new Runnable() {// 每隔一段时间就触发异常
			@Override
			public void run() {
				// throw new RuntimeException();
				System.out.println(Thread.currentThread().getName() + "111正在执行。。。");
				System.out.println("================");
			}
		}, 1000, 5000, TimeUnit.MILLISECONDS);
		exec.scheduleAtFixedRate(new Runnable() {// 每隔一段时间打印系统时间，证明两者是互不影响的
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "222正在执行。。。");
				System.out.println(System.nanoTime());
			}
		}, 1000, 2000, TimeUnit.MILLISECONDS);
	}
}
