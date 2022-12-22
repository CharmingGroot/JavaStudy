package com.mc.study_util.annotation;

import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {

		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");

			if(method.isAnnotationPresent(Count100.class)) { // 메서드가 가지고있는 isAno 메서드가 특정 어노테이션이 메서드에 적용이 되어있는지 확인하는 부분.
				for (int i = 0; i < 100; i++) { 
					hello.hello();
				}
			}else {
				System.out.println("어노테이션 적용안됨");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
