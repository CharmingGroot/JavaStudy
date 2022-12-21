package git_only.com.mc.b_stringClass;

public class ShadowOfStringClass {

	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "456";
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// 문자열과 문자열을 더하면 내부적으로는 다음과 같이 실행된다.
		String str4 = new StringBuffer().append(str1).append(str2).toString(); // 10번줄을 실행하면 내부에선 이런일이 일어난다.
		System.out.println(str4);
		
		// 문자열을 +로 더하게되면 항상 StringBuffer가 실행된다.
		
		// 문자열을 반복하면 어떻게 될까?
		String str5 = "";
		for (int i = 0; i < 100; i++) {
			str5 = str5 + "$";
		}
		System.out.println(str5);
		// 위와 같은 방식으로 반복문 내에서 문자열을 더할경우 반복문이 돌 때마다 new연산자를 통해 객체가 생성된다.
		// 자바언어는 new연산자가 많이 사용될수록 프로그램의 속도가 느려지기 때문에 다른 방법을 사용해야한다.
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
		// 위와 같은 형태로 반복문 외부에서 버퍼를 생성하여 반복문 내에서 새로운 객체가 생성되는 것을 방지한다.
		// 조금 더 좋은 프로그래밍을 할 수 있을 것이다.
		
		
	}
	

}
