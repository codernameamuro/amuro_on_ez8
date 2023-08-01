package ch05.unit02;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[][] = new char[5][5];
		char n = 'A';
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[4-j][i] = n++;
				/*
				 for (int i = 0; i < c.length; i++) {
				for (int j = 4; j < c.length; j--) {
				c[j][i] = n++;
				 */
			}

		}
		for(int i = 0; i<c.length; i++) {
			for(int j = 0; j<c[i].length; j++) {
				System.out.printf("%3c",c[i][j]);
			}System.out.println();
		}
	}

}
