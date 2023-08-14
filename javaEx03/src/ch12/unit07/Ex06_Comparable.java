package ch12.unit07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex06_Comparable {

	public static void main(String[] args) {
		
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("다잡아", "010-1111",23));
		list.add(new UserVO("하하하", "010-2222",20));
		list.add(new UserVO("노노노", "010-3333",22));
		list.add(new UserVO("마마가", "010-4444",23));
		list.add(new UserVO("마가가", "010-5555",21));
		
		disp("정렬  전...",list);
		
		//크기순으로 정렬 : Comparable 인터페이스가 구현되어 있어야 함 
		Collections.sort(list); // UserVO에서 기준을 잡을 값을 정하지 못함
		disp("정렬 후...",list);
		
	}
	
	public static void disp(String title, List<UserVO> list) {
		System.out.println(title);
		
		for(UserVO vo : list) {
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getTel()+"\t");
			System.out.println(vo.getAge());
		}
	}

}

class UserVO implements Comparable<UserVO>{ // comparable 인터페이스만 구현되면 자동으로 정렬이 됨
	private String name;
	private String tel;
	private int age;
	
	
	public UserVO() {
		
	}
	
	public UserVO(String name, String tel, int age ) {
		this.name=name;
		this.tel=tel;
		this.age=age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// compareTo : Comparable 인터페이스 메소드를 정렬 기준으로 잡음 
	@Override
	public int compareTo(UserVO o) {
		// return name.compareTo(o.getName()); // 이름 오름차순
		// return -name.compareTo(o.getName()); // 이름 내림차순
		// return age - o.getAge(); // 나이 오름차순
		return -(age - o.getAge()); // 나이 내림차순
	}
}
