package ch07.unit01;

import ch07.join.Member; // ctrl + shift + o  : import // import ch07.join.* join 아래 다 가져옴 하지만 따로 하는게 좋음 
import static java.lang.Math.*;
public class Ex01 {

	public static void main(String[] args) {
		User obj = new User();  // 동일한 패키지의 클래스는 바로 사용 가능
		obj.setName("홍길동");
		obj.setAge(10);
		System.out.println(obj.getName()+","+obj.getAge());
		
		
		//ch07.join.Member m = new ch07.join.Member();
		//다른 패키지의 클래스를 패키지명을 명시하여 호출
		//다른 패키지의 클래스를 패키지명 import 후 호출
		
		Member m = new Member();
		m.setId("abc");
		m.setName("다자바");
		System.out.println(m.getId()+","+m.getName());
		
		// static import를 했으므로 Math.random() 대신 random()으로 호출
		System.out.println(random());
		
		//  m. 입력시 만들지 않은 형식이 존재 아버지 것. 상속의 원리 
	}

}
