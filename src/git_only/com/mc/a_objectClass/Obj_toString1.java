package git_only.com.mc.a_objectClass;

public class Obj_toString1 {

	public static void main(String[] args) {

		
		String country = new String("Korea");
		java.util.Date today = new java.util.Date();
		
		System.out.println(country); // korea 
		System.out.println(country.toString()); // korea 
		System.out.println(today); // today
		System.out.println(today.toString()); // today
		
	}

}
