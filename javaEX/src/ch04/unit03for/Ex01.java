package ch04.unit03for;

/*
 for(초기식;조건식;증감식){
 }
 
 조건식 : true or false만 올 수 있다
 		조건식이 false이면 for문은 빠져 나감 
 초기식 -> 조건식(참) -> 문장 -> 증감식
  	     조건식(참) -> 문장 -> 증감식... 반복
  	     조건식(거짓) -> for문을 빠져 나감 
 */

public class Ex01 {

	public static void main(String[] args) {
		/*
		int n;
		for (n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
		System.out.println("\n밖:" + n);
		*/
		
		//for 안에서 변수 선언 가능 
		//int n=1; 선언해도 사용 불가
		for(int n=1; n<=10; n++) {
			System.out.println(n + " "); ;
		}
		// System.out.println("\n밖:" + n); //컴오류
		//for문 안에서 선언헌 변수는 밖에서 사용 불가 

	}

}
