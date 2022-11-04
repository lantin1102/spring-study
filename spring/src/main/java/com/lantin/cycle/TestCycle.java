package com.lantin.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {


	public static void main(String[] args) {


		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("cycle.xml");


		// BeanA a = ac.getBean(BeanA.class);
		BeanB b = ac.getBean(BeanB.class);
		//
		// a.getA();

		// LogUtil logUtil = (LogUtil) ac.getBean("logUtil");
		// logUtil.logBeforeExecute();

		b.getB();
	}
}
