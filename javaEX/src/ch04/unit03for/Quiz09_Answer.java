package ch04.unit03for;

public class Quiz09_Answer {

	public static void main(String[] args) {
		int s = 0;
		
		for(int n = 1; n<=100; n++) {
			s+=n;
			if(n%10==0) {
				System.out.println((n-9)+"~"+n+"까지 합: "+s);
				s=0;
			}
		}

	}

}
