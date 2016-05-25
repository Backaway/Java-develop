package com.cmcc.dubbo.consumer;
/**
 * @Type TpsTestConsumer.java
 * @Desc 
 * @author wanghuizhou
 * @date Jan 19, 2016 11:24:35 AM
 * @Version V1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmcc.common.RondomBuilder;
import com.cmcc.common.RondomBuilder.TYPE;
import com.cmcc.dubbo.service.ServiceInterface;

public class TpsTestConsumer {
	private static int THREAD_NUMBER = 10;
	private static int EXECUTE_TIMES = 100000;

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		context.start();
		final ServiceInterface performanceTest = (ServiceInterface) context.getBean("serviceInterface");

		ExecutorService executor = Executors.newFixedThreadPool(THREAD_NUMBER);
		List<Future<Long>> results = new ArrayList<Future<Long>>();

		final String str = RondomBuilder.getRandom(100, TYPE.LETTER);

		for (int i = 0; i < EXECUTE_TIMES; i++) {
			results.add(executor.submit(new Callable<Long>() {

				public Long call() throws Exception {
					long begin = System.currentTimeMillis();
					performanceTest.SendStr(str);
					long end = System.currentTimeMillis();
					return end - begin;
				}
			}));
		}
		executor.shutdown();
		while (!executor.awaitTermination(1, TimeUnit.SECONDS))
			;

		long sum = 0;
		for (Future<Long> result : results) {
			sum += result.get();
		}

		System.out.println("---------------------------------");
		System.out.println("number of threads :" + THREAD_NUMBER + " times:" + EXECUTE_TIMES);
		System.out.println("running time: " + sum + "ms");
		System.out.println("TPS: " + (double) (EXECUTE_TIMES * THREAD_NUMBER * 1000) / (double) (sum));
		System.out.println();

		return;
	}
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * ------------------------------------------------------------------------- Jan
 * 19, 2016 wanghuizhou creat
 */