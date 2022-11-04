package com.lantin.test;

import com.lantin.anno.MyTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestApp {




	@MyTest
	public void testMethod1(){
		System.out.println("测试11");

	}
	@MyTest
	public void testMethod3(){
		System.out.println("测试22");

	}
	@MyTest
	public void testMethod4(){
		System.out.println("测试33");

	}

	public static void main(String[] args) {

		TestApp testApp = new TestApp();
		Class<TestApp> testAppClass = TestApp.class;
		Method[] declaredMethods = testAppClass.getDeclaredMethods();


		for (Method declaredMethod : declaredMethods) {
			if (declaredMethod.isAnnotationPresent(MyTest.class)){
				Parameter[] parameters = declaredMethod.getParameters();

				try {
					declaredMethod.invoke(testApp);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
