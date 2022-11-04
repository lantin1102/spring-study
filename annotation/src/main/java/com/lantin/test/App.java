package com.lantin.test;


import com.lantin.anno.MyAnnoTargetField;
import com.lantin.anno.MyAnnoTargetMethod;
import com.lantin.anno.MyAnnoTargetParam;
import com.lantin.anno.MyAnnoTargetType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnnoTargetType
public class App {

	@MyAnnoTargetField
	private String oneField;

	@MyAnnoTargetMethod
	public String method01(@MyAnnoTargetParam String param,@MyAnnoTargetParam Integer count) {
		return param+count;
	}

	public String getOneField() {
		return oneField;
	}

	public void setOneField(String oneField) {
		this.oneField = oneField;
	}


	 static class Child extends App {




	}
	public static void main(String[] args) {
		App appTest = new App();

		// 注解需要通过反射获取
		Annotation[] annotations = appTest.getClass().getAnnotations();
		AnnotatedType[] annotatedInterfaces = appTest.getClass().getAnnotatedInterfaces();
		MyAnnoTargetType annotation1 = App.class.getAnnotation(MyAnnoTargetType.class);

		String value = annotation1.value();
		System.out.println(value);

		try {
			Method method01 = appTest.getClass().getMethod("method01",String.class,Integer.class);
			MyAnnoTargetMethod annotation = method01.getAnnotation(MyAnnoTargetMethod.class);
			System.out.println(annotation.value());
		//	 获取方法参数的注解
			Annotation[][] parameterAnnotations = method01.getParameterAnnotations();
			for (int i = 0; i < parameterAnnotations.length; i++) {
				Annotation[] parameterAnnotation = parameterAnnotations[i];
				for (int i1 = 0; i1 < parameterAnnotation.length; i1++) {
					MyAnnoTargetParam annotation2 = (MyAnnoTargetParam) parameterAnnotation[i1];
					String value1 = annotation2.value();
					System.out.println(value1);
				}
			}
			method01.invoke(appTest, "默认参数1", 2);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		Child child = new Child();

		MyAnnoTargetType annotation = child.getClass().getAnnotation(MyAnnoTargetType.class);

		Annotation[] declaredAnnotations = child.getClass().getDeclaredAnnotations();
		System.out.println(declaredAnnotations.length);
		System.out.println(annotation);

	}
}
