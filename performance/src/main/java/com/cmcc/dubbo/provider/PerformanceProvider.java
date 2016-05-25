package com.cmcc.dubbo.provider;

import com.cmcc.dubbo.service.ServiceInterface;

public class PerformanceProvider implements ServiceInterface {

	public String SendStr(String str) {
		return str;
	}
}
