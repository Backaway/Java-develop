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
package com.cmcc.dubbo.service;

/**
 * @Type DemoServiceImpl.java
 * @Desc 
 * @author wanghuizhou
 * @date Jan 18, 2016 6:12:15 PM
 * @Version V1.0
 */
public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		return "Hello " + name;
	}
}



/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * Jan 18, 2016 wanghuizhou creat
 */