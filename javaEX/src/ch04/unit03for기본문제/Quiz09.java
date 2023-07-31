package ch04.unit03for기본문제;

public class Quiz09 {

	public static void main(String[] args) {

		int n, s;
		s = 0;
	

		for (n = 1; n <= 100; n++) {
			s += n;
			if(n%10==0) {
				
				System.out.printf("%d~%d까지 합 : %d\n", n-9, n, s);
				s=0; //값 초기화 
				
			}

		}

	}

}
