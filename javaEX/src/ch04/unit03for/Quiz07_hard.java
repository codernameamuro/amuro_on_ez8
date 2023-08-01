package ch04.unit03for;

public class Quiz07_hard {

	public static void main(String[] args) {

		int count, count2;
		count = count2 = 0;

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				count++;
				if (count % 4 == 0) {
					System.out.println();
				}

			}
		}System.out.println();
		for(int k = 1; k<=9; k++) {
			for(int l=6; l<=9; l++) {
				System.out.print(l+"*"+k+"="+l*k+"\t");
				count2++;
				if(count2%4==0) {
					System.out.println();
				}
			}
		}
	}

}
