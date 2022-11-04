package com.lantin.aop;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class LiveLive {

	@Autowired
	private MemberClassA memberClassA;

	public void dailySleep(){
		System.out.println("睡觉");
		memberClassA.doSth();
	}
}
