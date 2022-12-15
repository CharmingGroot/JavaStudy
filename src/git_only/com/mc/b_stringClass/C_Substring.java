package git_only.com.mc.b_stringClass;

public class C_Substring {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		// fullName 에서 .의 위치 찾기
		int index = fullName.indexOf('.');
//		System.out.println(index); // 5
		// fullName의 첫 번째 글자부터 . 이 있는 곳까지 글자를 추출한다.
		
		String str1 = fullName.substring(0,index); // ~가 있는 곳까지 == 마지막인덱스
//		String str2 = fullName.substring(index);
		System.out.println(str1);
//		System.out.println(str2);
		
		// '.'의 다음 문자부터 시작해서 문자열의 끝까지 출력
		String str2 = fullName.substring(index+1,fullName.length());
		System.out.println(str2);
		
		System.out.println("파일의 이름은 : "+ str1);
		System.out.println("확장자의 이름은 : "+ str2);
		
	}
}
