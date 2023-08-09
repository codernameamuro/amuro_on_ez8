package ch12.unit02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		System.out.println("전체출력 ---1");
		for(int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("전체출력 ---2");
		for(String s : list) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("전체출력 ---3 : 반복자");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // 데이터 있으면 true, 없으면 false
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		System.out.println("전체 역순 출력 ---1");
		for(int i = list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n");



		

	}

}
