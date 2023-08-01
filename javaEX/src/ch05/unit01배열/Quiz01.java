package ch05.unit01배열;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String []line = new String[] { "원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양" };
		int year;
		
		do {

		System.out.println("년도 ?");
		year = sc.nextInt();
		} while(year<1900);
		
		System.out.printf("%d년도는 %s띠의 해입니다.\n", year, line[y%12]);
		
		sc.close();
	}

}
