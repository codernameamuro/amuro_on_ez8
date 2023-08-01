package ch05.unit01배열;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int tot=0;

		for (int i = 0; i < num.length; i++) {
			do {
				System.out.println((i+1)+":번째 점수");
				num[i]=sc.nextInt();
				
			}while(num[i]<1 || num[i]>10);
			
			tot+=num[i];
			
			
			
		
		
		}
		/*
		int max=0; 
		int min=10;
	
		for(int n : num) {
			if(max<n) {
				max=n;
			}if(min>n) {
				min=n;
			}
			
			
		}
		*/ // 처음값을 초기값으로 
		int max, min;
		max=min=num[0];
		for(int i =1; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}else if (min>num[i]) {
				min=num[i];
			}
		}
		int result;
		result=tot-min-max;
		System.out.print("점수 리스트:");
		for(int n : num) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("취득 점수:"+result);
		sc.close();

	}

}
