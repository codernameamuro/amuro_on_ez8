package ch05.unit01배열;

public class Ex09 {

	public static void main(String[] args) {
		// 1차원 초기의 배열 
		// : 초기화 하는 경우 초기값의 개수가 배열의 크기 
		// : 초기화 할 경우 new int[]를 new int [5] 처럼 요소의 크기는 지정 불가
		// : 초기화 하지 않는 경우 new int[5]로 할때 0으로 초기화 
		
		int[] num = new int [] {2,4,6,8,10}; // 선언과 동시애 초기화 
		// int [] num = new int[5] {2,4,6,8,10}; // 컴파일 오류
		//초기화 할때는 요소의 크기 지정 불가 
		// int[] num = {2,4,6,8,10}; // 가능
		//선언과 동시에 초기화 할 경우 new int [] 생략 가능
		
		int [] num2;
		num2 = new int [] {1,3,5,7,9};
		// num2={1,3,5,7,9}; //컴파일 오류. new int [] 생략 불가 
		
		System.out.println("배열 요소의 개수: "+ num.length);
		int s = 0;
		for(int i = 0; i<num.length; i++) {
			s+=num[i];
		}
		System.out.println("합 1:" + s);

		s=0;
		for(int n : num2) {
			s+=n;
		}
		System.out.println("합 2 :" + s);

	}

}
