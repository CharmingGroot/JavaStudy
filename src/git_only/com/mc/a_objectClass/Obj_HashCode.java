package git_only.com.mc.a_objectClass;

public class Obj_HashCode {

	public static void main(String[] args) {

		String str1 = new String("ABC");
		String str2 = new String("ABC");
	
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()); // override가 가능한 Object의 hashCode
		System.out.println(str2.hashCode()); // str1과 str2는 같은 객체를 참조한 같은 문자열을 가진다, hashCode의 값이 같다.
		
		System.out.println(System.identityHashCode(str1)); // 고유한 hashCode를 return
		System.out.println(System.identityHashCode(str2)); // 출력해보면 str1과str2는 상이함.

		// 어쨋거나 실무에서 원하는 것은 두 인스턴스를 오차없이 비교하는 것이다.
		// String클래스를 상속받는 hashCode()는 문자열이 같으면 동일한 해시코드를 반환
		// identityHashCode는 객체의 주소값으로 해시를 생성
	
	
	
	}

}
