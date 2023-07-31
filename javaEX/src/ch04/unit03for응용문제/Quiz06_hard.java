package ch04.unit03for응용문제;

public class Quiz06_hard {

	public static void main(String[] args) {
		int i,j,s;
		for ( i = 4; i<=1000; i++) {
			s=0;
			for ( j = 1; j<=i; j++) {
				if(i%j==0) {
					s+=j;
					if(i==s) {
						System.out.println(i);
					}
					
				}
			}
		}

	}

}
