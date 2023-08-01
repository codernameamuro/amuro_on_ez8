package ch05.unit02;

public class Ex04 {

	public static void main(String[] args) {
		int[][]a=new int [5][4];
		
		int n = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=++n;
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}	
		// 배열로 받아야 함, 2차원 배열을 향상된 for 문으로 출력   
		
		for(int i[]:a) {
			for(int j :i) {
				System.out.printf("%3d",j);
			}
			System.out.println();
			
			// 위 아래 값 같게 바꿔보기 
			
			
		}
	}

}
