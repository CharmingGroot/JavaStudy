package git_only.com.mc.a_objectClass;

public class Obj_Equals {

	public static void main(String[] args) {
		Person p1 = new Person(1414124123123L);
		Person p2 = new Person(1414124123123L);
	
		if(p1 == p2) { // 두 인스턴스가 바라보는 참조변수가 서로 다르다.
			System.out.println("p1 과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1 과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2)) { // 같은 참조변수를 바라보고있다. equsls() 는 오버라이딩되어 두 인스턴스의 타입을 비교한 뒤 true 이면 id와 매개변수의 id를 비교한다.
			System.out.println("p1 과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1 과 p2는 다른 사람입니다.");
		}
		
		
	}

}

class Person{
	long id; // 

	// equals 메서드 오버라이딩, 재정의 하였다.
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) { // obj가 null 이외의 값을 가지면서, Person 타입일 때.
			return id == ((Person)obj).id; // true, this.id와 Person타입으로 long타입으로 형변환된 매개변수obj.id를 비교한다.
		} else {
			return false; 
		}
	}

	public Person(long id) { // long타입의 id를 매개변수로 갖는 Person 메서드
		this.id = id; // 매개변수를 this.id에 초기화한다.
	}
	
	
}