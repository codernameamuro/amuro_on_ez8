package ch02.unit04DataType;

// 확장열 키보드로 표현 할 수 없는 특수한 것.

public class Ex09_DataType {

	public static void main(String[] args) {
		System.out.println("a\tb\tc"); // \t: TAB키
		System.out.println("x\ny\nz"); // \n: 라인넘기기(10)
		System.out.println("1\\2"); // \붙으면 특수문자로 인식함 \\하면 역슬래시 나옴
		System.out.println("1\""); // \" : 쌍따음표
		System.out.println('\u0043'); // 유니코드, C:67(0x43)
		System.out.println('\101'); // 
		
		
		
	}

}
