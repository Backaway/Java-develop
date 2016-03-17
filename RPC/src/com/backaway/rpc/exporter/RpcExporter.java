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
package com.backaway.rpc.exporter;

import java.net.ServerSocket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Type RpcExporter.java
 * @Desc
 * @author wanghuizhou
 * @date Mar 4, 2016 11:02:24 AM
 * @Version V1.0
 */
public class RpcExporter {
	static Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

	public static void exporter(String hostName, int port) throws Exception {
		ServerSocket server = new ServerSocket();
		server.bind(new InetSocket);
	}

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * ------------------------------------------------------------------------- Mar
 * 4, 2016 wanghuizhou creat
 */