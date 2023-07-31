package ch02.unit05var;

public class Ex01 {

	public static void main(String[] args) {
		// int a=10;
		// double b = 10.5;
		
		// 지역변수 유형 추론 [ 지역 변수만 사용 가능] ---> {} 안에서만 사용 가능 JDK10 이상 부터 가능 
		// var x; // 컴파일 오류 발생. 초기화 필요 
		var a = 10;
		var b = 10.5;
		var c = "Seoul";
		
		int x = a;
		double y = b;
		String z = c;
		
		System.out.println(x + "," + y + "," + z);
	}

}
