package ch04.unit05continue;

public class Ex01 {

	public static void main(String[] args) {
		// continue : while, do~while, for 문에서만 사용 가능
		// 			: while, do~while은 조건식으로 살행
		//			: for문은 update 식(재초기 식)을 실행 
		// 1~100까지 수중 2또는 3의 배수를 제외한 수의 합 구하기 
		int n,s;
		n=s=0;
		
		while(n<100) {
			n++;
			if(n%2==0 || n%3==0) {
				continue;
			}
			s+=n;
		}
		System.out.println("결과:"+s);
		

	}

}
