package git_only.com.mc.b_stringClass;

public class D_StringBuffer {
	

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abcdefghijklmno");
		StringBuffer sb2 = sb.delete(2, 9);
		
		System.out.println(sb2);
	}
	
	
}
