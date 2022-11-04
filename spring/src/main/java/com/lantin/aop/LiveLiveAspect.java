package com.lantin.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LiveLiveAspect {

	@Pointcut("execution(* com.lantin.aop.LiveLive.dailySleep())")
	private void pointCutMethod(){
	}


	@Before("pointCutMethod()")
	public void beforeMethod(){
		System.out.println("吃饭");
	}
	@After("pointCutMethod()")
	public void afterMethod(){
		System.out.println("做梦");
	}


}
