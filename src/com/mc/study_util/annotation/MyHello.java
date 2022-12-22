package com.mc.study_util.annotation;

public class MyHello {

	// 미리 지정한 어노테이션을 사용하려면
	
	@Count100
	public void hello() {
		System.out.println("Hello");
	}
	
}
