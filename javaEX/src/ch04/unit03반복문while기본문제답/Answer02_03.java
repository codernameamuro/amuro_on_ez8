package ch04.unit03반복문while기본문제답;

public class Answer02_03 {

	public static void main(String[] args) {
		int s,n;
		s=n=0;
		while(n<10) {
			n++;
			s+=n%2==0? -n:n;
		}
		System.out.println("결과:"+s);
	}

}
