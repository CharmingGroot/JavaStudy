package com.mc.study_util.collection.generic;

public class Box2 {
	public static void main(String[] args) {
//		Box1 box = new Box1(); // box1클래스에 있는 생성자 호출
//		box.setObj(new Object()); // box1의 Object 생성자를 set해줌
//		Object obj = box.getObj(); // box1의 obj가 아닌 box2의 obj이다. 혼동하지 말 것. box2의 obj를 box1의 obj값을 가져와 초기화해준다.
//		
//		box.setObj("Hello");
		
		// Object 타입을 사용하면 Object타입만 들어올 수 있는게 아니라 Object 타입을 상속받는 모든 클래스가 들어올 수 있다.
		// 만약 String타입을 사용하고 싶다면?
		// String으로 형변환 해주면 된다.
		// 그런데,
		// String도 쓰고, integer도 쓰고 상황에 맞게 값을 쓰려면 계속 형변환을 해줘야 한다.
		// 귀찮쟈나
		// 그래서 나온게 generics이다.
		// public class Box1 <E>{} 는 가상 클래스 E를 사용하겠다는 의미이다.
		// 이런 형태로 제너릭을 지정하면,
		
		Box1<Object> box = new Box1<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box1<String> box2 = new Box1<>();
//		box2.setObj(1); 스트링만 받을수 있게 설정해뒀기 때문에 int형태는 못온다.
		box2.setObj("hello");
		String str = box2.getObj();
		
		Box1<Integer> box3 = new Box1<Integer>();
		box3.setObj(3);
		int v3 = box3.getObj();
		// 위와같은 형태로 타입을 바꿔가며 사용이 가능해진다.
		
		// 선언은 가상의 타입으로 선언하고,
		// 사용할 때에는 구체적으로 타입을 명시!
		
		// 제너릭을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스들이다.
		
	}
}
