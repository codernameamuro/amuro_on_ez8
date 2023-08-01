package ch06.unit03;

public class Ex17_varargs {

	public static void main(String[] args) {
		// 가변 인자
		Test17 t = new Test17(); // 매개변수가 없는 생성자가 없기 때문에  // 인자가 없기 때문에 만들 수 있다. 생성자는 
		
		int s1 = t.sum(1,2,3,4,5);
		int s2 = t.sum(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}

class Test17{
	

	public int sum(int... n) { // ... => 부정인수, 내부적으로는 배열로 처리 
		int s = 0;
		
		/*
		for(int a : n ) {
			s+=a;
			
		}
		*/
		
		for(int i = 0; i<n.length; i++) {
			s+=n[i];
		}
		
		return s;
	}
	
	
}
