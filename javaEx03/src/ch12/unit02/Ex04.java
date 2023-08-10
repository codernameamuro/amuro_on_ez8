package ch12.unit02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("자바");
		list1.add("오라클");
		list1.add("서블릿");
		print(list1);
		System.out.println();
		/*
		: List 인터페이스 구현 클래스
        : 검색시 속도가 빠름
        : 동기화 되지 않음(멀티 스레드에서 안전하지 않음)
		 */
		
		List<String> list2 = new LinkedList<String>();
		list2.add("서울");
		list2.add("부산");
		list2.add("인천");
		print(list2);
		/*
		: List 인터페이스 구현 클래스
        : 검색은 느림
        : 앞에서 추가하고 뒤에서 삭제가 빈번한 경우 빠름
        : 앞뒤 아무데서나 추가 삭제 가 빈번한 경우 
        : 중간에 삽입 삭제시에는 속도가 현저히 떨어짐. LinkedList 사용하지 말것
        : 동기화 되지 않음(멀티 스레드에서 안전하지 않음)

		 */
		
		
		

	}
	
	
	public static void print(List<String> list) {
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}

}
