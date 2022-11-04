package com.lantin.anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface MyAnnoTargetParam {

	/**
	 * 注解的一个元素
	 */
	String value() default "定义在方法参数的注解的value属性默认值";


}
