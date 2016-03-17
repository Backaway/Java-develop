/*
 * Project: Reactor
 * 
 * File Created at Jan 29, 2016
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
package com.backaway.reactor;
/**
 * @Type Acceptor.java
 * @Desc 
 * @author wanghuizhou
 * @date Jan 29, 2016 2:38:30 PM
 * @Version V1.0
 */

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class Acceptor implements Runnable {
	private Reactor reactor;

	public Acceptor(Reactor reactor) {
		this.reactor = reactor;
	}

	@Override
	public void run() {
		try {
			SocketChannel socketChannel = reactor.serverSocketChannel.accept();
			if (socketChannel != null)// 调用Handler来处理channel
				new SocketReadHandler(reactor.selector, socketChannel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * Jan 29, 2016 wanghuizhou creat
 */