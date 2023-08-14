package ch12.unit06;

import java.util.PriorityQueue;

public class Ex03_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<TestVO> q = new PriorityQueue<TestVO>();
		q.offer(new TestVO("홍자바",25));
		q.offer(new TestVO("김자바",20));
		q.offer(new TestVO("다자바",23));
		q.offer(new TestVO("나자바",24));
		q.offer(new TestVO("너자바",25));
		
		
		// 나이 많은 사람먼저 출력 
		while(q.peek() !=null) {
			TestVO vo = q.poll();
			System.out.println(vo.getName()+":"+vo.getAge());
		}
		
	}

}

class TestVO implements Comparable<TestVO>{
	private String name;
	private int age;
	
	public TestVO() {
		
	}
	
	public TestVO(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(TestVO o) {
		
		return (age-o.getAge());
	}
	
}
	
	
