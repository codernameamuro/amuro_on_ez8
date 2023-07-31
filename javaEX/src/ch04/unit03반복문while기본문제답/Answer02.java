package ch04.unit03반복문while기본문제답;

public class Answer02 {

	public static void main(String[] args) {
		int s,n;
		
		s=n=0;
		while(n<10) {
			n++;
			s+=n;
			n++;
			s-=n;
			
		}
		System.out.println("결과:" +s);

	}

}//짝수합과 홀수합 따로 구해서 더하는법도 있음
