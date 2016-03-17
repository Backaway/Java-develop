/*
 * Project: RPC
 * 
 * File Created at Mar 4, 2016
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
package com.backaway.rpc.service;
/**
 * @Type EchoServiceImpl.java
 * @Desc 
 * @author wanghuizhou
 * @date Mar 4, 2016 11:00:26 AM
 * @Version V1.0
 */
public class EchoServiceImpl implements EchoService {

	@Override
	public String echo(String ping) {
		return ping != null ? ping + " --> I am ok." : "I am ok.";
	}
}



/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * Mar 4, 2016 wanghuizhou creat
 */