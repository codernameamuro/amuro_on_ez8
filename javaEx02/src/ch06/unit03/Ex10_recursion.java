package ch06.unit03;

// Stack 메모리 : 지역변수/ 매개변수
// Stack : LIFO(Last In First Out)
public class Ex10_recursion { // public 키워드는 한 번 

	public static void main(String[] args) {
		// 재귀호출 
		
		Test10 obj = new Test10();
		obj.disp(5);
		
		System.out.println();

	}

}

class Test10{
	public void disp(int n) {
		if(n>1) {
			disp(n-1); // 재귀호출 : 자기 자신을 호출
		}              // 실행하지 못한 값을 스택이란 공간에 저장한다. 밑에서 부터 저장하고 제일 위의 값부터 출력하기 때문에 //  1 2 3 4 5 순으로 출력된다
		
		System.out.printf("%4d",n);
	}
	
}
