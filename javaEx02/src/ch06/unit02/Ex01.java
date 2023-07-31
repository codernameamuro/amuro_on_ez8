package ch06.unit02;

public class Ex01 {
// main = 시동, 진입점 
	public static void main(String[] args) {
		// 객체 만들기
		// 객체 선언 (레퍼런스 변수)
		Rect obj; 
		
		// 객체 생성(메모리 할당)
		obj = new Rect(); 
		
		//데이터 설정
		obj.가로 = 10; 
		obj.세로 = 20;
		
		int a = obj.area();
		int b = obj.len();
		
		System.out.println("넓이 :"+a);
		System.out.println("둘레 :"+b);
		
		
	}
}
/*
 - 사각형의 넓이와 둘레
 - 추상화 작업
 - 데이터 : 가로, 세로의 길이
 - 기능  : 넓이, 둘레 
*/
// 클래스 : 틀
class Rect{
	// 데이터(필드) //width, height
	int 가로, 세로;
	
	
	// 기능(메소드)
	public int area() {
		int result= 가로*세로;
		return result;
	}
	
	public int len() {
		int s = (가로+세로)*2;
		return s;
	}
	
}
