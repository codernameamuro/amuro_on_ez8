package ch06.unit03;

public class Ex02 {

	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		int s;
		
		s=obj.sum(20);
		System.out.println(s);
		

	}

}

class Test2{
	// 1~n 까지 합구하기
	
	public int sum(int n) {
		int s = 0;
		for(int i = 1; i<=n; i++) {
			s+=i;
		}
		return s;
	}
}