package com.lantin.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.Property;

public class PropertyTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("property.xml");
		PropertyConfig bean1 = ac.getBean(PropertyConfig.class);
		bean1.onUpdate();
		Context1 bean = ac.getBean(Context1.class);


	}
}
