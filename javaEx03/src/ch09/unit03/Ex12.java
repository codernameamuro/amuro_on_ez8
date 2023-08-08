package ch09.unit03;

public class Ex12 {
	// throws : 메소드를 호출한 곳에서 예외를 처리하도록 설정
	public static void main(String[] args) throws Exception {
		User12 obj = new User12();
		int n;
		
		// 위 처럼 main()에서 예외를 throws할 경우 예외가 발생하면 
		// 프로그램은 비정상적으로 종료된다.
		obj.setNum(-5);
		
		n = obj.getNum();
		System.out.println(n);

		System.out.println("end...");

	}

}

class User12 {
	private int num;

	public int getNum() {
		return num;
	}

	// throw : 예외를 강제로 발생시키는 것
	// throws : 메소드를 호출한 곳에서 예외를 catch 하도록 설정 // 메소드 뒤에서만
	public void setNum(int num) throws Exception { // checked exception
		if (num < 0) {
			// 강제로 checked exception을 발생 시킴
			throw new Exception("0 이상만 가능합니다.");
		}

		this.num = num;
	}
}