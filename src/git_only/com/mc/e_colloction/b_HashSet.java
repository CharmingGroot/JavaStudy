package git_only.com.mc.e_colloction;

import java.util.HashSet;
import java.util.Iterator;

public class b_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		
	}
}
