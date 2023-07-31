package ch04.unit03반복문while기본문제답;

public class Answer02_2 {

	public static void main(String[] args) {
		int n,s;
		s=n=0;
		while(n<10) {
			n++;
			if(n%2==0) {
				s-=n;
			}else {
				s+=n;
			}
		}
		System.out.println("결과:" + s);
	}

}
