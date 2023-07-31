package ch04.unit03반복문while기본문제;

public class Quiz04 {

	public static void main(String[] args) {
		
		int n, s, count;
		
		n=s=count=0;
		
		while(n<=100) {
			n++;
			if(n%3==0 || n%5==0) {
				s+=n;
				count++;
			}
			
		}System.out.println(s+","+(s/count));
		
		
		
		
		
		

	}

}
