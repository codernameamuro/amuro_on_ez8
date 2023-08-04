package ch08.unit03;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		Object obj = "korea"; // up-casting
		// System.out.println(obj.length()); // 컴오류 length --> string 것
		System.out.println(((String)obj).length());
		
		//up-casting
		Object n1 = 10;
		Object n2 = 20;
		
		// Object n3 = n1 + n2; // 컴오류 object 연산 불가능 , 기본 자료형 int 는 가능
		int n3 = (Integer)n1+(Integer)n2; // 다운 캐스팅
		System.out.println(n3);
		
		//Object[] oo = {"seoul", 90, 80, "korea"};
		// Arrays.sort(oo); // 런오류 서로 다른 객체
		
		Object[] oo = {"seoul", "korea", "jeju"};
		Arrays.sort(oo);
		for(Object o : oo)
		System.out.println(o);
	}
}

