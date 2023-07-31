package ch04.unit03반복문while기본문제답;

public class Answer08 {
	// 1+2+4+7+11... 
	public static void main(String[] args) {
		int s=0, n=0, t=1;
		
		while(n<20) {
			s+=t;
			System.out.println(t+" ");
			n++;
			t+=n;
		}
		System.out.println("\n결과:" + s);

	}

}
