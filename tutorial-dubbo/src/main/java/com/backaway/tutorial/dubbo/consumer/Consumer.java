package com.backaway.tutorial.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.backaway.tutorial.dubbo.service.DemoService;

/**
 * @Type Consumer.java
 * @Desc
 * @author wanghuizhou
 * @date Jan 18, 2016 6:34:57 PM
 * @Version V1.0
 */
public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String res = demoService.sayHello("world"); // 执行远程方法
		System.out.println(res); // 显示调用结果
	}

}

