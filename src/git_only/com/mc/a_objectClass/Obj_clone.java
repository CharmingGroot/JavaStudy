package git_only.com.mc.a_objectClass;

import java.awt.Point;

// cloneable 인터페이스 구현
public class Obj_clone implements Cloneable{ // 클론 구현시 Cloneable을 반드시 implements 구현해줘야한다. 안해주면 예외발생한다.

	int x, y;

	public Obj_clone(int x, int y) { 
		this.x = x;
		this.y = y;
	}

	

	@Override
	public String toString() {
		return "Obj_clone [x=" + x + ", y=" + y + "]";
	}

	public Object clone() { // 접근제한자를 protected에서 public 으로 변경.
		Object obj = null;
		try {
			obj = super.clone();  // 조상클래스의 클론 호출
		} catch (CloneNotSupportedException e) {}// clone은 반드시 예외처리해주어야한다.
		return obj;
	}
}

class CloneEX1{
	public static void main(String[] args) {
		Point original = new Point(2, 6);
		Point copy = (Point)original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}