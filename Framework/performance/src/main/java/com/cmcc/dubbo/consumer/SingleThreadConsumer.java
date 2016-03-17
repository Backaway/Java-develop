package com.cmcc.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmcc.common.RondomBuilder;
import com.cmcc.common.RondomBuilder.TYPE;
import com.cmcc.dubbo.service.ServiceInterface;

public class SingleThreadConsumer {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		context.start();
		ServiceInterface performanceTest = (ServiceInterface) context.getBean("serviceInterface");

		long startMili, endMili;
		int loop = 100;

		// 1K String
		try {
			String str1k = RondomBuilder.getRandom(1000, TYPE.LETTER);
			startMili = System.currentTimeMillis();
			String returnStr1k = null;
			for (int i = 0; i < loop; i++) {
				returnStr1k = performanceTest.SendStr(str1k);
			}
			endMili = System.currentTimeMillis();
			System.out.println("1K String 平均传输耗时为：" + ((endMili - startMili) / (float) loop) + "毫秒,返回字符长度："
					+ returnStr1k.length());
		} catch (Exception ex) {
			System.out.println("1K String 测试失败!");
		}

		// 100K String
		try {
			String str100K = RondomBuilder.getRandom(100000, TYPE.LETTER);
			startMili = System.currentTimeMillis();
			String returnStr100k = null;
			for (int i = 0; i < loop; i++) {
				returnStr100k = performanceTest.SendStr(str100K);
			}
			endMili = System.currentTimeMillis();
			System.out.println("100K String 平均传输耗时为：" + ((endMili - startMili) / (float) loop) + "毫秒,返回字符长度："
					+ returnStr100k.length());
		} catch (Exception ex) {
			System.out.println("100K String 测试失败!");
		}

		// 1M String
		try {
			String str1M = RondomBuilder.getRandom(1000000, TYPE.LETTER);
			startMili = System.currentTimeMillis();
			String returnStr1M = null;
			for (int i = 0; i < loop; i++) {
				returnStr1M = performanceTest.SendStr(str1M);
			}
			endMili = System.currentTimeMillis();
			System.out.println("1M String 平均传输耗时为：" + ((endMili - startMili) / (float) loop) + "毫秒,返回字符长度："
					+ returnStr1M.length());
		} catch (Exception ex) {
			System.out.println("1M String 测试失败!");
		}

		System.out.println("all test done!");
	}
}
