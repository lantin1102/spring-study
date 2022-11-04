package com.lantin.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanInComponent {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:component.xml");

		Component3 bean = ac.getBean(Component3.class);


		System.out.println(bean);

	}
}
