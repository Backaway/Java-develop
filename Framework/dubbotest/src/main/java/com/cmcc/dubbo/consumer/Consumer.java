/*
 * Project: dubbotest
 * 
 * File Created at Jan 18, 2016
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with cmccim.com.
 */
package com.cmcc.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmcc.dubbo.service.DemoService;

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

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * ------------------------------------------------------------------------- Jan
 * 18, 2016 wanghuizhou creat
 */