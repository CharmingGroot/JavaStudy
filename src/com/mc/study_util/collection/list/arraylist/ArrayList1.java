package com.mc.study_util.collection.list.arraylist;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {

		// List 인터페이스를 구현했다.
		// ArrayList는 객체의 저장공간으로 배열을 사용한다.
		// 저장 순서를 유지하고 중복을 허용한다.
		
		// 다형성 : 조상타입의 참조변수로 자손객체를 다룰 수 있는것.
		
		// ArrayList를 사용할 때는 초기용량을 잘 설정해야한다.
		
		
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		// ArrayList에는 객체만 저장가능하다
		// 숫자를 직접 대입하면 오토박싱되어 알아서 객체로 저장된다.
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// sublist로 만들어진 list는 읽기전용이다. 1 <= x < 4 
		
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		// Collection은 인터페이스, Collections는 Util클래스
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("=============");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		System.out.println("list1.containsAll(list2) : "+ list1.containsAll(list2));
		
		
		// 맨뒤에는 빈공간에 추가만 하면 되지만, add로 중간에 뭔가를 끼워넣는건 부담이 가는 작업이다.
		list1.add("B");
		list1.add(3,"K");
		
		System.out.println("=============");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		
		list1.set(3, "AA");
		System.out.println("=============");
		System.out.println(list1.toString());
		
		
		// 지정 객체의 인덱스를 반환한다.
		System.out.println("index="+list1.indexOf("AA"));
		
		System.out.println("=============");
		list1.add(0, "1");
		System.out.println(list1.toString());
		list1.remove(1); // 1번 인덱스가 삭제됨
		list1.remove(new Integer(1)); // 1을 삭제
		// 저장할 때는 오토박싱을 활용했을지라도 삭제할 때는 타입을 명시해줘야한다.
		
		System.out.println(list1.toString());
		
		System.out.println("=============");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		// list2에서 list1에 포함된 객체를 삭제하기
		for (int i = list2.size()-1; i > 0; i--) {
			if(list1.contains(list2.get(i))){
				list2.remove(i);
			}
		} System.out.println(list2.toString());
		
		// ArrayList 에 저장된 객체를 삭제하려면, 맨 마지막 객체부터 삭제해야한다.
		// 첫 번째 객체부터 지우면 배열복사가 발생한다.
		
		
		
	}

}
