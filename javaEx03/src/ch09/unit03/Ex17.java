package ch09.unit03;

public class Ex17 {

	public static void main(String[] args) {
		
		User17 uu = new User17();
		try {
			//uu.set("홍길동", 20);
			uu.set("홍길동", -5);
			//uu.set("홍", 5);
			//uu.set("홍", -5); --> 동시에 일어날 수는 없기 때문에 먼저오는 이름 exception을 출력한다 
			System.out.println(uu.getName()+","+uu.getAge());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("end...");
		

	}

}

class User17 {
	private String name;
	private int age;

	public void set(String name, int age) throws Exception{
		try {

			setName(name);
			setAge(age);

		} catch (Exception e) {
			// System.out.println(e.toString());
			//throw new Exception("입력 오류..."); // 새로운 예외를 다시 발생시킴
			throw e; // catch 한 예외를 다시 던짐
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		// if(name.length()<2 || name == null) { // 잘못된 코딩
		if (name == null || name.length() < 2) { // 이름에 null을 넣을 수도 있기 때문에 null.length() 불가능.
			throw new Exception("이름은 두 자 이상입니다."); // 비교를 null부터 해야함
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("나이는 0이상입니다.");
		}
		this.age = age;
	}

}