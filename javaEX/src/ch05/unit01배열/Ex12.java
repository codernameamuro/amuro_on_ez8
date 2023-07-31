package ch05.unit01배열;

import java.util.Arrays;

public class Ex12 {

	public static void main(String[] args) {
		int [] num = new int [10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			
		}
		//발행된 난수 
		for(int n : num) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		//오름차순 정렬 
		Arrays.sort(num);
		
		//정렬 후 
		for(int n : num) {
			System.out.print(n+" ");
		}
		System.out.println();

	}

}
