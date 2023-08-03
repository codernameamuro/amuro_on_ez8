package ch07.unit08;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String [] ss = {"자바","스프링","서블릿","오라클","자바스크립트","프론트","백엔드"};
		 
		// 이진검색
		int idx;
		
		// 이진검색은 먼저 정렬 되어 있어야 함 
		Arrays.sort(ss);
		System.out.println("정렬후 : "+Arrays.toString(ss));
		
		// 리액트 위치
		idx=Arrays.binarySearch(ss, "리액트");
		System.out.println(idx); // 없으면 -1
		
		idx=Arrays.binarySearch(ss, "오라클");
		System.out.println(idx); // 3
		
		// 5 7 10 13 15 17 20 23 25 27 30 
		// 순차검색 => 25는 9번 만에 검색 
		// 이븐검색 => 25 > 17 => 17오른쪽에 있음 
		// 25 == 25
		
	}

}
