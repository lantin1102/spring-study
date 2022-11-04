package com.lantin.cycle;


public class BeanA {
	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}


	public void getA() {
		System.out.println("get A ");
	}
}
