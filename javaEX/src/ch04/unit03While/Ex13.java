package ch04.unit03While;

public class Ex13 {
	//1~100까지 합 구하기. 단,, 수가 10의 배수가 될때마다 합출력 

	public static void main(String[] args) {
	
		int n, s;
		
		s=n=0;
		
		while(n<100) {
			n++;
			s+=n;
			if(n%10==0) {
			System.out.println("1~"+n+"까지 합:"+s);
			}
		}

	}

}
