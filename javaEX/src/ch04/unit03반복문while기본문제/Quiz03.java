package ch04.unit03반복문while기본문제;

public class Quiz03 {

	public static void main(String[] args) {
		char c = 'A';
		int n = 0;
		
		while(c<='Z') {
			System.out.print(c);
			c++;
			n++;
			if(n%5==0) {
				System.out.println();
				
			}
			
		}
		System.out.println();
		


	}

}
