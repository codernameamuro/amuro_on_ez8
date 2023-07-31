package ch05.unit02;

import java.util.Scanner;
/*
 -석차
 점수 석차 : 초기값 1
      1 2 3 4 5
 90   1    
 80   1+1+1	
 85	  1+1
 80   1+1  +1
 70   1+1+1+1+1
 */

public class Ex08석차구하기selection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name;
		int[][] score; //사람 과목 
		int[] total;
		int[] rank;
		int count;

		String[] subject = new String[] { "국어", "영어", "수학" };

		do {
			System.out.print("인원수?");
			count = sc.nextInt();
		} while (count < 1);
		
		//배열의 메모리 할당 

		
		
		
		name = new String [count];
		score= new int[count][3];
		total= new int [count];
		rank = new int [count];
		
		
		// 인원수 만큼 이름, 국,영,수 점수를 받아 총점을 계산
		for(int i = 0; i<count; i++) {
			System.out.print((i+1)+"번째 이름?");
			name[i]= sc.next();
			
			//세 과목 점수 입력 및 총점 계산
			for(int j = 0 ; j<score[i].length; j++) {
				System.out.print(subject[j]+" ? ");
				score[i][j]=sc.nextInt();
				total[i]+=score[i][j];
				
			}
			// 석차를 1로 초기화
			rank[i]=1;
		}
		//석차를 계산;
		for(int i=0; i<count-1; i++) {
			for(int j=i+1; j<count; j++) {
				if(total[i]>total[j]) {
					rank[j]++;
				}else if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<count; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0 ; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				
			}
			System.out.print(total[i]+"\t");
			System.out.print(total[i]/3+"\t");
			
			System.out.println(rank[i]);
		}
		sc.close();

	}

}
