package ch05.unit02;

public class Es {

	public static void main(String[] args) {

		int num[][] = new int[5][5];
		int n = 0;
		String s = " ";
		

		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					
					n+=i;
					
					
					num[i][j]=n;

				
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%3d", num[i][j]);

			}
			System.out.println();
		}

	}

}
