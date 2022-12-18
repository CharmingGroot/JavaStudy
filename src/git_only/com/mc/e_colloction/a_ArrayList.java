package git_only.com.mc.e_colloction;

import java.util.*;

public class a_ArrayList {
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);

		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(0));
		list1.add(new Integer(0));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		
		Collections.sort(list1);
		Collections.sort(list2);
//		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : "+
				list1.containsAll(list2)
				);
		list1.add("b");
		list2.add("c");
		
		list2.add(3,"a");
		
		// Object 외에 다른 타입을 대입할 수 없다. 이것이 제네릭을 사용하여 임의로 데이터타입을 지정하는 이유이다.
		for (Object l1 : list1) { 
			System.out.print(l1);
		}
		
		
		System.out.println("list1.retainAll(list2) : "+
				list1.retainAll(list2) // 1에서 2와 겹치는 부분만 남기고 나머지는 삭제한다.
				);
		
		for (int i = list2.size()-1; i >= 0; i--) { // i가 list2의 사이즈부터 0과 같아질 때 까지 i를 1씩 차감.
			if(list1.contains(list2.get(i))) { // 만약 list1이 .list2의 i인덱스 값를 가지고 있다
				list2.remove(i); // list2의 i위치의 값을 지워라
			}
		}
		
		
		System.out.println(list1.toString());
		Collections.sort(list1);
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		System.out.println("=======================================");
		
		
		// 자르기
		final int LIMIT = 10; // 자르고자하는 글자 개수 지정
		String source = "0123456789abcdefghiasdnflen";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10); // 크기를 여유있게 잡는다
		
		for (int i = 0; i < length; i+=LIMIT) {
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT));
			} else
			{
				list.add(source.substring(i));
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
