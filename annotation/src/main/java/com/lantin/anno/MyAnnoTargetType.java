package com.lantin.anno;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MyAnnoTargetType {

	/**
	 * 注解的一个元素
	 */
	String value() default "定义在类、接口、注解上的注解的value属性默认值";

}
