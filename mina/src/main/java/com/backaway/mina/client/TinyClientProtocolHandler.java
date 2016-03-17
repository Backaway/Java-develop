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
package com.backaway.mina.client;
/**
 * @Type TinyClientProtocolHandler.java
 * @Desc 
 * @author wanghuizhou
 * @date Mar 8, 2016 6:28:51 PM
 * @Version V1.0
 */

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyClientProtocolHandler extends IoHandlerAdapter {

	private final static Logger LOGGER = LoggerFactory.getLogger(TinyClientProtocolHandler.class);

	@Override
	public void sessionCreated(IoSession session) {
		LOGGER.info("CLIENT::CREATED");
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		LOGGER.info("CLIENT::CLOSED");
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		LOGGER.info("CLIENT::OPENED");
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) {
		LOGGER.info("CLIENT::*** IDLE #" + session.getIdleCount(IdleStatus.BOTH_IDLE) + " ***");
	}

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) {
		LOGGER.info("CLIENT::EXCEPTIONCAUGHT");
		cause.printStackTrace();
	}

	public void messageSent(IoSession session, Object message) throws Exception {
		LOGGER.info("CLIENT::MESSAGESENT: " + message);
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