package ch02.unit6howtomakedoc;

/*
 -doc 주석 (문서화 주석 만들기)
  javadoc -use class.java -d 폴더명 
 -예 : doc 이름의 폴더가 없으면 만들고 그 안에서 HTML 문서를 만듬 
 	cmd> javadoc -use Ex01.java -d doc 
 
 */
public class Ex01 {
	/**
	 * 짝수를 판별하는 메소드 
	 * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다. </p>
	 * @param num		짝수인지 판별하기 위한 수 <code>int</code>
	 * @return			짝수이면 true를 반환한다. <code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num % 2 == 0;		
	}

}
