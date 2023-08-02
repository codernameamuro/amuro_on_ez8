package ch07.unit04;

public class Ex11 {

	public static void main(String[] args) {
		String s;
		
		// 한 줄의 문자열  jdk15부터 정식스펙
		/*
		s = "SELECT hak, name, kor, eng, math "
				+ "FROM score "
				+ "WHERE hak = ?";
		*/
		// multiline : """~""" jdk 15;
		s= """ 
				
				SELECT hak, name, kor, eng, math
				FROM score
				WHERE hak=?
				
		  """;
		
		System.out.println(s);

	}

}
