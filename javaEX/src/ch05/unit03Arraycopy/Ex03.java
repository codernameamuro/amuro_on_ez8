package ch05.unit03Arraycopy;
/*                  0x100           0x200 
	a[0x100]-----> |0x200| ------> 10 20 30 
	               |0x300| ------> 40 50 60
 */

public class Ex03 {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		int[][] b = new int[2][3];
		
		//2차원 배열에서는 행이 가지고 있는 주소를 복사함  --> 결국은 주소를 복사함 실제 값 x
		System.arraycopy(a, 0, b, 0, b.length); // 2개 복사  값을 복사한다면 6개 복사 해야함
		
		System.out.println("a배열...");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();

		}
		System.out.println("\nb배열...");
		for (int i = 0; i <b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}
		b[1][1]=500;
		System.out.println(a[1][1]+":"+b[1][1]);
		// 500 : 500

	}

}
