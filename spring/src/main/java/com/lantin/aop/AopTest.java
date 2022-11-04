package com.lantin.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Aspect Oriented Programming
 */
public class AopTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");

		LiveLive bean = ac.getBean(LiveLive.class);

		bean.dailySleep();
	}
}
