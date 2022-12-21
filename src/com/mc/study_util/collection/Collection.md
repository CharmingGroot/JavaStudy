# 컬렉션 프레임워크

**여러가지 도구의 집합**

> 컬렉션 프레임워크에서 가장 기본이 되는 인터페이스는 컬렉션 인터페이스이다.

## 컬렉션 인터페이스

### iterator()

> 자료를 하나씩 꺼내기 위한 iterator인터페이스를 반환하는 메서드이다.

iterator인터페이스가 왜 필요하냐면 
컬렉션은 저장된 순서를 기억하지 못하기 때문에
"첫번째 자료를 전달해줘", "두번째 자료를 달라" 같은 기능구현이 안된다.

때문에 iterator를 통해 자료를 하나씩 꺼내는 방식을 채택하였다.

#### iterator인터페이스

boolean hasnext()
	- 반복할 요소가 남아있는경우 true를 반환한다.
		- 꺼낼 것이 있는지, 없는지 살펴본다.

next()
	- iteration(반복)에서 다음 요소를 반환한다.
		- 하나씩 자료를 꺼낼 때 사용한다.

---

### set 인터페이스
컬렉션인터페이스를 상속받으며
중복이 허용되지 않는다.
순서를 기억하지 못한다.

boolean add(Object) 
	- 같은 자료가 있으면 false를 반환한다.

#### HashSet 클래스 > Set 인터페이스를 구현한다.
	- boolean add(Object)
	- iteratoriterator()
	- int size()

---

### list 인터페이스
순서를 기억하며 중복을 허용한다
0번째, 1번째, 2번째와 같이 순서를 받아들일 수 있는


Object get(int index) 
	- 특정 인덱스의 값을 반환한다.

#### ArrayList 클래스 > List인터페이스를 구현한다.
	- boolean add(Object) 
	- Object get(int) 
	- iterator iterator() 
	- int size() 

---

### Map 인터페이스
key와 value를 가지는 자료구조이다.
key값은 중복될 수 없다.


get(Object)
	- key를 매개변수로 받아들이는 get메서드를 활용하여 값을 꺼낸다.
	
keySet() : Set
	- 중복될 수 없는 key의 특징을 이용한 key를 매개변수로 Set을 반환한다.

put(Object, Object) : void 
	- 값을 저장할 때
	
	
#### HashMap 클래스 > Map 인터페이스를 구현한다.

	- get(Object) Object
	- keySet() Set
	- put(Object, Object) void