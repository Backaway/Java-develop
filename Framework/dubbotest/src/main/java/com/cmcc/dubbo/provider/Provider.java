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
package com.cmcc.dubbo.provider;

/**
 * @Type Provider.java
 * @Desc 
 * @author wanghuizhou
 * @date Jan 18, 2016 6:13:01 PM
 * @Version V1.0
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
		context.start();
		System.out.println("请按任意键退出");
		System.in.read(); // 按任意键退出
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