package ch11.unit02;

public class Ex02 {

	public static void main(String[] args) {
		Test2 tt = new Test2();
		tt.set("서울");
		
		Object obj = tt.get();
		String s = (String)obj; // 캐스팅이 필요함 
		System.out.println(s.length());
		
		Test2 tt2 = new Test2();
		tt2.set(100);
		Integer ii = (Integer)tt2.get();
		System.out.println(ii);
		
		// String s2 = (String)tt2.get(); // 런타임오류 발생 
	}

}

class Test2{
	private Object value;

	public void set(Object value) {
		this.value = value;
	}

	public Object get() {
		return value;
	}
	
}