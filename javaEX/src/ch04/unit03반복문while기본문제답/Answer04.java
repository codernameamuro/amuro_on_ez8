package ch04.unit03반복문while기본문제답;

public class Answer04 {

	public static void main(String[] args) {
		int n, s, cnt;
		
		n=0;
		s=0;
		cnt=0;
		while(n<100) {
			n++;
			if(n%3==0 || n%5==0) {
				s+=n;
				cnt++;
			}
		}
		System.out.println("합:"+s);
		System.out.println("평균:"+(s/cnt));
	}

}
