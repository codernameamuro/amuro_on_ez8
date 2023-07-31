package ch04.for응용문제;

public class TSN {

	public static void main(String[] args) {

		int count = 0;

		for (int n = 1; n <=100; n++) {
			System.out.print(n + "\t");
			if (n % 10 == 2 || n % 10 == 5 || n % 10 == 8) {
				System.out.print("*");

			}else if (n/10==3 || n/10==6 || n/10==9) {
				
			}
		
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}

		}
	

	}

}
