package ch05.unit02;

public class Quiz08마방진 {

	public static void main(String[] args) {
		int [][]a;
		int n, row, col;
		
		n=3; //5*5배열
		a=new int [n][n];
		
		row=0;
		col=n/2;
		
		for( int i=1; i<=n*n; i++) {
			a[row][col] = i;
			if(i%n==0) {
				row++;
			}else {
				row--;
				col++;
			}if(row<0) {
				row=n-1;
			}if(col<=n) {
				col=0;
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
