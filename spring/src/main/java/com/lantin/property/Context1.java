package com.lantin.property;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class Context1 implements InitializingBean{


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("context1后置处理");
	}

	public void refresh(){
		System.out.println("do refresh");
	}
}
