package ch12.unit05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 - Map
 : 키, 값 구조
 : 카는 중복 허용하지 않음
 : 키는 순서가 없음
 : 중복될 경우 마지막에 온 값이 기존 값을 덮음
 : 값은 바꿀 수 있지만 키는 바꿀 수 없음 
 : 키를 바꾸고 싶은 경우 삭제후 다시 등록
 : 값을 변경하는 방법 replace(키,값)으로 변경 가능
 - 구현 클래스
 : HashMap - 동기화 되지 않음
 : Hashtable - 동기화 지원
 : LinkedHashMap - 키가 등록된 순서 유지
 : TreeMap - 키 순서로 정렬, 키는 Comparable 인터페이스가 구현되어 있어야 함 
 */
public class Ex01_Map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// map에 값 저장
		// 키 , 값
		map.put("자바", 100);
		map.put("오라클", 90);
		map.put("서블릿", 80);
		map.put("자바스크립트", 85);
		map.put("리액트", 95);
		map.put("스프링", 90);
		map.put("파이썬", 100);
		map.put("프론트", 95);
		map.put("자바", 90); // 키가 같으면 기존 값을 덮음
		System.out.println(map);
		// 순서를 유지하지 않는다.
		// map에서 값 가져오기
		int s = map.get("자바"); // integer를 자동으로 형변환을 해준다
		System.out.println("자바:" + s);

		//int n = map.get("웹"); // 런타임오류 --> null은 형변환이 불가능하기 때문에
		Integer ob = map.get("웹"); // null
		System.out.println(ob);
		System.out.println();
		
		// Map에서 모든 데이터 가져오기 
		// Map에는 Iterator(반복자)가 없다. 향상된 for문도 사용 불가
		// 키에서 Set을 반환 받아 Iterator(반복자)를 이용한다.
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
		
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println();
		System.out.println("데이터 개수:"+map.size());
		
		System.out.println();
		System.out.println("자바가 키에 존재하나?");
		System.out.println(map.containsKey("자바"));
		
		System.out.println("웹이 키에 존재하나?");
		System.out.println(map.containsKey("웹"));
		
		System.out.println();
		System.out.println("값에 100이 있나?");
		System.out.println(map.containsValue(100));
		
		// 삭제
		map.remove("프론트");
		System.out.println(map);
		
		System.out.println(map.size()+map.toString());
		System.out.println(map.toString()+map.size());
		
	}

}
