package ch09.unit03;

public class Ex11_throw {

	public static void main(String[] args) {
		User11 obj = new User11();
		int n ;
		
		try {
			obj.setNum(-5);
			n = obj.getNum();
			System.out.println(n);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("end...");

	}

}

class User11{
	private int num;
	
	public int getNum() {
		return num;
	}
	// throw : 예외를 강제로 발생시키는 것 
	// throws : 메소드를 호출한 곳에서 예외를 catch 하도록 설정  // 메소드 뒤에서만 
	public void setNum(int num) throws Exception {  // checked exception
		if(num<0) {
			// 강제로 checked exception을 발생 시킴 
			throw new Exception("0 이상만 가능합니다.");
		}
		
		this.num=num;
	}
}