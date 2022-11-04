package com.lantin.bootstudy.configurationproperties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "test.properties", ignoreUnknownFields = false)
public class TestAObj
{
	private String name;

	private Integer age;

	private static String str;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static String getStr() {
		return str;
	}

	public static void setStr(String str) {
		TestAObj.str = str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
