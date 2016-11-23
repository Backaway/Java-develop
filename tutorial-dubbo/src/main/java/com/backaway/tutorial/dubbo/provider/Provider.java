package com.backaway.tutorial.dubbo.provider;

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
