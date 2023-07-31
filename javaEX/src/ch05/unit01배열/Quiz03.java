package ch05.unit01배열;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] lotto = new int [6];
		int score;
		do {
			System.out.println("구매개수[1~5] ?");
			score=sc.nextInt();
		}while(score<1 || score>5);
		
		for( int i = 1; i<=score; i++) {
			for(int l = 0; l<lotto.length; l++) {
				lotto[l]=(int)(Math.random()*45)+1;
				
				for(int j = 0; j<l; j++) {
					if(lotto[l]==lotto[j]) {
						l--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			System.out.println(i+"번째:");
			for(int l : lotto) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
