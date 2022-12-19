//package git_only.com.mc.e_colloction;
//
////import java.util.*;
////
////import org.graalvm.compiler.nodes.virtual.EnsureVirtualizedNode;
//
//public class MyVector implements List{
//	
//	Object[] data = null; // 객체를 담기위한 객체배열
//	int cpapcity = 0; // 용량
//	int size = 0; // 크기
//	
//	MyVector(int capacity){
//		if(capacity < 0) {
//			throw new IllegalArgumentException("유효하지 않은 값입니다. : "+ capacity);
//		}
//	}
//	
//	public MyVector() {
//		this(10);
//	}
//	
//	// 최소한의 저장공간을 확보하는 메서드.
//	public void ensureCapacity(int minCapacity){
//		if(minCapacity - data.length >0) {
//			setCapacity(minCapacity);
//		}
//	}
//	
//	public boolean add(Object obj) {
//		//새로운 객체를 저장하기 전, 저장공간을 확보한다.
//		ensureCapacity(size+1);
//		data[size++] = obj;
//				return true;
//	}
//	
//	
//	
//	// 범위를 벗어난 경우
//	public Object get(int index) {
//		if(index < 0 || index >= size) {
//			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
//		}
//		return null;
//	}
//	
//	public Object remove(int index) {
//			
//		Object oldObj = null;
//		
//		if(index < 0 || index >= size) 
//			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
//			
//		oldObj = data[index];
//		// 삭제하고자하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워주어야한다.
//		if(index != size-1) {
//			System.arraycopy(data, index, data, index, size-index-1);
//		}
//
//		// 마지막 데이터를 null 로 한다. 배열은 0부터 시작하므로 마지막 요소는 index가 size -1이다.
//		data[size-1] = null;
//		size--;
//		return oldObj;
//	}
//	
//	public boolean remove(Object obj) {
//		for (int i = 0; i < size; i++) {
//			if(obj.equals(data[i])) {
//				remove(i);
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public void trimToSize() {
//		setCapacity(size);
//	}
//	
//	
//	
//	
//	private void setCapacity(int capacity) {
//		if(this.capacity(== capacity) return;
//		
//		Object[] tmp = new Object[capacity];
//		System.arraycopy(data, 0, tmp, 0, size);
//		data = tmp;
//		this.capacity = capacity;
//		
//	}
//
//	@Override
//	public int size() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public boolean isEmpty() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean contains(Object o) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterator iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Object[] toArray() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Object[] toArray(Object[] a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//
//	@Override
//	public boolean containsAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean addAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean addAll(int index, Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//
//	@Override
//	public boolean retainAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public void clear() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	@Override
//	public Object set(int index, Object element) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void add(int index, Object element) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	@Override
//	public int indexOf(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int lastIndexOf(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public ListIterator listIterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ListIterator listIterator(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List subList(int fromIndex, int toIndex) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean removeAll(Collection c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//}
