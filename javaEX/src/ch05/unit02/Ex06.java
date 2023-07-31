package ch05.unit02;

public class Ex06 {

	public static void main(String[] args) {
		// 2차원 배열의 초기화
		int[][] a= new int [] [] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] b= new int [] [] {{10,20,30},{40,50},{60,70,80,90}};
		
		//a[2][1] : 8
		//b[0][1] : 20
		//b[1][2] : 런타임 
		//b[2][3] : 90
		
		// length a  
		// for b
		System.out.println("a 배열 ...");
		for(int i =0; i<a.length;i++) {
			for(int j = 0 ; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("b배열...");
		for(int i[] : b) {
			for(int j : i ) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	

	}

}
