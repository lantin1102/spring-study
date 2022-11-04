package com.lantin.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {


	public static void main(String[] args) {
		ApplicationContext ac = new MyXmlApplicationContext("bean.xml");

		// ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		ac.getId();

	}
}
