package com.lantin.cycle;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Log2Util2 {

	@Pointcut("execution(* com.lantin.cycle..*.*(..))")
	public void pointCutMethod() {}


	@After("pointCutMethod()")
	public void after(){

		System.out.println("log util2 在方法后记录日志");

	}


}
