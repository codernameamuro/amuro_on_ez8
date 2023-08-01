package ch04.unit03for;

public class Ex07 {

	public static void main(String[] args) {
		// 1~100 사이의 수중 3또는 5의 배수를 한줄에 5개씩 출력하고
		//마지막에 합과 평균을 구하시오
		
		int s, count;
		s=count=0;
		
		for(int n=1; n<=100; n++) {
			count++;
			if(n%3==0 || n%5==0) {
				s+=n;
				count++;
				System.out.print(n+" ");
				if(count%5==0) {
					System.out.println();
				}
				
			}
		}
		System.out.println("\n합:"+s);
		System.out.println("평균:"+ (s/count));

	}

}
