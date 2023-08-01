package ch06.unit03;

public class Ex11 {

	public static void main(String[] args) {
		Test11 t = new Test11();
		
		int s;
		
		s=t.sum(10);
		System.out.println("결과:"+s);
		

	}

}

class Test11{
	public int sum(int n) {
		/*
		int s  = 0 ;
		for(int i=1; i<=n; i++) {
			s+=i;
		}
		return s;
		*/ // 처리 속도는 반복문장이 더 빠름 
		
		return n >=1 ? n + sum(n-1) : 0 ;  // 1. 10 + s(9) ... 2. 9 + s(8) ............. 2 + s(1); // 반드시 종료 조건이 있어야 한
	}   // stackoverflow 에러 피하기 위해 
}