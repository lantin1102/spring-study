package com.lantin.property;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import java.util.Properties;


public class PropertyConfig extends PropertyPlaceholderConfigurer {

	private Context1 context1;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		System.out.println("热更新初始化读取文件");
	}

	void onUpdate() {
		System.out.println("热更新处理"+context1);
		context1.refresh();
	}

	public void setContext1(Context1 context1) {
		this.context1 = context1;
	}
}
