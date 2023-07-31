package ch06.unit03;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		Test4 tt = new Test4();
		int[] a = new int[] { 2, 4, 6, 8, 10 };
		int s;

		s = tt.total(a);
		System.out.println(s);
		
		int n = 10;  // n-> main 매소드의 변수  아래 n과 다른 변수!
		tt.sub(n);   // 실인수와 가인수는 기억공간을 따로 확보한다.  // n이 갖고 있는 값 10을 넘긴다
		System.out.println(n); // 10 
		
		int []x = {1,2,3,4,5};
		System.out.println(Arrays.toString(x)); // 배열이 갖고 있는 내용을 찍어줌 [1,2,3,4,5]
		tt.sub2(x); // x가 가지고 있는 배열의 주소를 넘긴다. 
		System.out.println(Arrays.toString(x)); // [1,100,3,4,5]

	}

}

class Test4 {
	// 인자로 넘어온 배열의 합 구하기
	public int total(int[] num) { // n은 sub() 메소드의 변수 
		int s = 0;
		for (int i = 0; i < num.length; i++) {
			s += num[i];
		}
		return s;
	}
	// 인자로 넘어온 일반변수의 값 변경 
	public void sub(int n ) {
		n = 100; // sub() 함수의 변수인 n의 값을 변경 
	}            // 따라서 main()의 변수 n은 변화가 없다 

	// 인자로 넘어온 배열의 요소 값 변경
	public void sub2(int[] a) {
		a[1] = 100;
		// a가 가지고 있는 주소의 1번 점자의 값을 변경 
	}	// 따라서 main에서의 a배열의 1번 첨자의 값도 변경됨 
	
	
}