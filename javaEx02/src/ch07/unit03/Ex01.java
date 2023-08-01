package ch07.unit03;

public class Ex01 {

	public static void main(String[] args) {
		int a = 10 , b;
		Integer obj = null; // int에 대응하는 Wrapper class
		
		// int는 null을 가질 수 없지만 Interger는 null을 가질 수 있음
		// b=null; // 컴오류
		
		// 기본 자료형을 Integer로 자동 형변환(Auto boxing)
		obj = a;
		// obj = Integer.valueOf(a);
		
		// Integer를 기본 자료형(int)로 형변화(Auto unboxing)
		b = obj;
		// b = obj.intValue();
		
		System.out.println(a+","+b+","+obj);
		
		System.out.println(Integer.MAX_VALUE); // final 변수임
		System.out.println(Integer.MIN_VALUE);
		

	}

}
