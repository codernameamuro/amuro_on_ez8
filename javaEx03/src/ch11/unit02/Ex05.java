package ch11.unit02;

public class Ex05 {

	public static void main(String[] args) {
		Test5<Integer> tt = new Test5<>();
		tt.append(10);
		tt.append(20);
		tt.append(30);
		
		// Integer[] i = tt.get(); // 런오류
		// 제네릭 배열은 casting이 필요함 
		Object [] oo = tt.get();
		for(Object o : oo) {
			Integer i = (Integer)o;
			System.out.println(i);
		}
		

	}

}

class Test5<E> {
	private E[] data;
	private int count;

	@SuppressWarnings("unchecked")
	public Test5() {
		// data = new E[10]; // 컴오류 제네릭으로 배열 정의 불가능
		// generic 배열의 메모리 할당
		data = (E[]) new Object[10]; // 알고 있는 경고, 어쩔 수 없음 (캐스팅을 하지 않는 것이 목적이기 때문에)
	}

	public void append(E e) {
		// ArrayIndexOutOfBoundsException 발생
		if (count >= data.length) {
			throw new ArrayIndexOutOfBoundsException("요소의 개수를 초과 했습니다");
		}
		data[count++] = e;
	}

	public E[] get() {
		return data;
	}

	public int getCount() {
		return count;
	}
}