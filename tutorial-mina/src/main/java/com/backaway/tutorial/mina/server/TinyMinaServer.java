/*
 * Project: mina
 * 
 * File Created at Mar 8, 2016
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
package com.backaway.tutorial.mina.server;
/**
 * @Type TinyMinaServer.java
 * @Desc 
 * @author wanghuizhou
 * @date Mar 8, 2016 6:27:13 PM
 * @Version V1.0
 */

import java.net.InetSocketAddress;

import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyMinaServer {

	private final static Logger LOG = LoggerFactory.getLogger(TinyMinaServer.class);
	/** Choose your favorite port number. */
	private static final int PORT = 8080;

	public static void main(String[] args) throws Exception {
		SocketAcceptor acceptor = new NioSocketAcceptor();
		acceptor.setReuseAddress(true);
		acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory()));

		// Bind
		acceptor.setHandler(new TinyServerProtocolHandler());
		acceptor.bind(new InetSocketAddress(PORT));
		LOG.info("Listening on port " + PORT);

		LOG.info("Server started!");

		for (;;) {
			LOG.info("R: " + acceptor.getStatistics().getReadBytesThroughput() + ", W: "
					+ acceptor.getStatistics().getWrittenBytesThroughput());
			Thread.sleep(3000);
		}
	}

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * Mar 8, 2016 wanghuizhou creat
 */
