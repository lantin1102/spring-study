package com.lantin.component;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Component1 {


	@Bean
	Component3 component3(){
		return new Component3();
	}
}
