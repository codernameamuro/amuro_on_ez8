package ch12.unit02;

import java.util.ArrayList;
import java.util.List;

/*
  - List 인터페이스
    : 순서가 있다. 배열과 유사한 구조. 
    : 기변 길이(저장 공간이 부족하면 자동으로 공간이 늘어남)
    : 중복적인 요소 추가 가능함 
    : 구현 클래스 - ArrayList, Vector, LinkedList 등 
 */
public class Ex01_ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // up-casting
		String s;

		// 마지막에 요소 추가
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("광주");
		list.add("서울"); // 중복 요소 추가 가능
		list.add("대전");

		System.out.println(list);

		list.add(2, "대구");
		System.out.println(list);

		// 데이터 개수 확인
		System.out.println("list size" + ":" + list.size());

		// 처음 데이터 반환
		System.out.println("첫 번째 데이터" + ":" + list.get(0));

		// 두 번째 데이터 반환
		s = list.get(1);
		System.out.println("두 번째 데이터" + ":" + s);

		// 마지막 데이터 반환
		System.out.println("마지막 데이터" + ":" + list.get(list.size() - 1));

		// list.remove(list.get(5));
		// System.out.println(list); // 먼저 위치한 요소를 제거함

		// 추가
		list.add(0, "한국");
		System.out.println(list);

		// 수정
		list.set(0, "대한민국");
		System.out.println(list);

		int idx;
		// 인천은 몇번째 위치
		idx = list.indexOf("인천");
		System.out.println(idx);

		idx = list.indexOf("세종");
		System.out.println(idx); // 없음 -1

		boolean d;
		d = list.contains("인천");
		System.out.println(d);

		idx = list.lastIndexOf("서울");
		System.out.println(idx);

		System.out.println("부산 존재 유무 :" + list.contains("부산"));

		// 삭제
		// list.remove
		// 대한민국 삭제
		list.remove(0);
		System.out.println(list);
		
		// 모두 삭제
		list.clear();
		System.out.println(list);
		// 모두 삭제 후 개수
		System.out.println(list.size());

	}

}
