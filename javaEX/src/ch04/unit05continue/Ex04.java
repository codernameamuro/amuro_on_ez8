package ch04.unit05continue;

public class Ex04 {

	public static void main(String[] args) {
		int cnt = 0;
		gogo:
		for ( int n=2; n<=100; n++) {
			for ( int i=2; i<=(n/2); i++) {
				if(n%1==0) {
					continue gogo;
				}
			}
			System.out.printf("%5d", n);
			cnt++;
			if(cnt%10==0) {
				System.out.println();
			}
		}

	}

}
