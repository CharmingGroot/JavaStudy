package git_only.com.mc.lang._c_StringBuffer;

public class A_StringBuffer {
	public static void main(String[] args) {	
		
		// 잊지마 StringBuffer는 문자열을 다루기위한 것.
		
		// 16 문자를 담을 수 있는 buffer(공간)를 가진 StringBuffer 인스턴스 생성
		StringBuffer sb = new StringBuffer("aaaabbbb"); 
		System.out.println(sb);
		
		
		// 지정된 개수의 문자를 담을 수 있는 Buffer를 가지진 StringBuffer 인스턴스 생성
		StringBuffer sb2 = new StringBuffer(32);
		// capacity로 용량 확인
		System.out.println(sb2.capacity());
		// length는 0으로 나옴
		System.out.println(sb2.length());
		
		// 지정된 문자열을 갖는 StringBuffer 타입의 인스턴스 생성
		StringBuffer sb3 = new StringBuffer("Hi");
		System.out.println(sb3);
		
		
		// 매개변수로 입력된 값을 문자열로 변환, StringBuffer의 인스턴스가 저장하고 있는 문자열 뒤에 붙인다.
		StringBuffer ap = new StringBuffer("abc");
		ap.append(true);
		ap.append('c');
		ap.append(3);
		ap.append(11.0).append(3551.30).append(sb3);
		System.out.println(ap);
		
		// 지정된 인덱스에 있는 문자열 반환
		StringBuffer rs = new StringBuffer("쇼미더머니11");
		System.out.println(rs.charAt(3));
		
		
		// 전달받은 문자열을 지정한 위치(pos)에 추가한다. pos는 0부터 시작
		StringBuffer newrs = rs.insert(3, "김");
		System.out.println(newrs);
		
		
		// 지정한 첫 인덱스부터 지정한 마지막 인덱스에 저장된 값을 전달한 문자열로 바꾼다.
		StringBuffer rep = new StringBuffer("123456789");
		System.out.println(rep.replace(0, 4, "치킨"));
		
		
		// 문자열 순서를 바꾼다.
		StringBuffer rev = new StringBuffer("쇼미더머니11");
		System.out.println(rev.reverse());
		
		// 지정한 위치의 문자를 전달한 문자로 바꾼다
		StringBuffer setChar = new StringBuffer("123456");
		setChar.setCharAt(3, '9');
		System.out.println(setChar);
		setChar.setCharAt(1, '꿿');
		System.out.println(setChar);
		
		
		// 주어진 매개변수만큼 문자열의 길이를 조절한다. 
		// 빈공간은 null문자로 채운다.
		// 원래 용량보다 적으면? 자른다.
		StringBuffer slength = new StringBuffer("123456");
		slength.setLength(3);
		System.out.println(slength);
		slength.setLength(32);
		System.out.println(slength);
		System.out.println(slength.capacity());
		System.out.println(slength.length());
		slength.setLength(3);
		System.out.println(slength);
		
		
		// StringBuffer를 String타입으로 변환
		StringBuffer toS = new StringBuffer("나는아름다운나비");
		String stR = toS.toString();
		System.out.println(stR);
		System.out.println(stR.equals(toS));
		
		
		// 지정한 범위 내 문자열을 String으로 뽑아서 반환
		System.out.println(toS.substring(4));
		System.out.println(toS.substring(2, 4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
