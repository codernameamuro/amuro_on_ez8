package ch05.unit01배열;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 선언과 메모리할당을 한 번에
		int[] score = new int[5];

		// 배열 요소에 값을 저장
		score[0] = 80;
		score[1] = 90;
		score[2] = 85;
		score[3] = 90;
		score[4] = 95;
		
		int tot = 0;
		/*
		for(int i =0; i<5; i++) {
			tot+=score[i];
			
		} 
		*/
		for(int n : score) { // 향상된 for 문  // 하나씩 score에 넘겨준다
			tot+=n;
			System.out.println(n);
		}
		System.out.println("결과 :" + tot);
	}

}
