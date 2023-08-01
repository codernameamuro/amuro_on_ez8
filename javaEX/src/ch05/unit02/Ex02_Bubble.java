package ch05.unit02;

import java.util.Arrays;

public class Ex02_Bubble {

	public static void main(String[] args) {
		//Bubble Sort
		int [] num = new int [] {17, 13, 16, 14, 15};
		int t;
		
		System.out.println("Source Data: ");
		for(int n : num) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		//Sort 
		//1회전 : .....
		
		// i 1 2 3 4 //
		for(int i = 1; i<=num.length; i++) {             // 0  1  2  3  4 
			for(int j = 0; j<=num.length-i; j++) {           //  1  2  3  4 
				if(num[i]>num[j]) {
					t=num[i]; num[i]=num[j]; num[j]=t;
				}
			}
			System.out.println(i+1+"회전:"+Arrays.toString(num));
		}
		
		System.out.println("Sort Data:");
		for(int n : num) {
			System.out.print(n+" ");
		}
		System.out.println();
		

	}

}
