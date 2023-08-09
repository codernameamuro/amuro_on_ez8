package ch12.unit02;

import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		// 불변 Collection, JDK 9 이상
		List<String> list = List.of("a","b","c");
		System.out.println(list);
		
		// list.add("d"); // 런오류
		// list.set(0, "A"); // 런오류
		

	}

}
