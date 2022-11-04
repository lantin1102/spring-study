package com.lantin.start;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyXmlApplicationContext extends ClassPathXmlApplicationContext {


	public MyXmlApplicationContext (String... configLocations){
		super(configLocations);
	}

	/**
	 * 自定义扩展 beanFactory 是否自动解决循环依赖  和是否允许重写BD
	 * @param beanFactory the newly created bean factory for this context
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展 AbstractApplicationContext");
		getEnvironment().setRequiredProperties("sdf");
	}
}
