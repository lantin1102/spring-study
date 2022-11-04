package com.lantin.cycle;

import org.springframework.transaction.annotation.Transactional;

public class LogUtil {


	public void logBeforeExecute(){
		System.out.println("执行前日志");
	}

	public void afterExecute(){
		System.out.println("执行后日志");
	}
}
