package ch06.unit04;

public class Ex06 {
	public static void main (String[] args) {
	Test6 t = new Test6();
	// t.age = 20;  컴오류, private은 외부 접근 불가 
	
	t.setName("이자바");
	t.setAge(20);
	
	System.out.println(t.getName()+ "님은" +t.result()+ "입니다.");
	

	}
}
// getter / setter 
class Test6{
	private String name;
	private int age;
	
	public String getName() {
		return name; // this.이 생략됨 
	}
	public void setName(String name) {
		this.name = name; // 매개변수와 필드명이 같으면 this. 불인다
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String result() {
		return age>=19? "성인" : "미성년자";
	}
	
}
