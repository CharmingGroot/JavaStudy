package com.mc.study_util.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;




// 실행시에 감지할 수 있는 어노테이션
@Retention(RetentionPolicy.RUNTIME) // 계속 else문만 실행되서 어디서 문제가 발생했나 봤는데 여기였다. RetentionPoilcy.Class로 설정되어있었다.
public @interface Count100 {

	
	
}
