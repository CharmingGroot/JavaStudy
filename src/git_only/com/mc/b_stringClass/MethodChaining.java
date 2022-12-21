package git_only.com.mc.b_stringClass;

public class MethodChaining {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		
		if(sb2 == sb3) System.out.println("sb2 == sb3");
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		// 이렇게 여러줄에 걸쳐서 작성해야할 것을 한줄에 작성 가능한 이유는
		// StringBuffer()는  자기자신을 리턴하기 때문에 계속해서 자신이 가진 메서드를 사용할 수 있다.

		System.out.println(str2);
		
	}
}
