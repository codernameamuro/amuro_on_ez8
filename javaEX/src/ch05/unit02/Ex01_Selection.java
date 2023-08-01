package ch05.unit02;

import java.util.Arrays;

public class Ex01_Selection {

	public static void main(String[] args) {
		int [] num = new int [] {15, 2, 13, 8, 12};
		
		// num의 데이터 그대로 출력 
		System.out.print("Source Data :");
		for(int n : num) {
			System.out.print(n+" "); // 강화된 for n값에 데이터를 넘겨 n을 출력
			
		}
		System.out.println();
		//sort
		
		int t ;
		for( int i = 0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]> num[j]) {   // 0:1 0:2 0:3 0:4
					t=num[i]; num[i]=num[j]; num[j]=t;
				}
			}
			
			// System.out.println((i+1)+"회전 :" + Arrays.toString(num));
		}
		System.out.print("Sort Data:");
		for ( int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
				
	
		

	}

}
