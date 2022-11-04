package com.lantin.aop;


import org.springframework.stereotype.Component;

@Component
public class MemberClassA {


	private String name = "默认";

	public void doSth(){
		System.out.println("成员A执行任务");
	}
}
