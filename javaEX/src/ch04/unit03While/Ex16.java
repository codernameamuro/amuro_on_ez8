package ch04.unit03While;

public class Ex16 {

	public static void main(String[] args) {
		//1~100 홀수를 한줄에 5개씩 출력 마지막에 합 출력
		
		int n, s, count;
		
		n=1;
		s=0;
		count=0;
		
		while(n<100) {
			System.out.print(n+"\t");
			count++;
			if(count%5==0) {
				System.out.println();
				
			}
			
			s+=n;
			n+=2;
		}System.out.println(s);
		
		
		

	}
}
	