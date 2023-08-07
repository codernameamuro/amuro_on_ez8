package ch08.unit08;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(Color.RED); // RED 출력
		// toString()을 재정의하면 원하는 내용 출력 가능
		// 열거형 상수의 기수(선언 위치) 출력
		for (Color c : Color.values()) {
			System.out.println(c + " -> " + c.ordinal());
			/*
			RED -> 0
			GREEN -> 1
			BLUE -> 2
			*/
		}
		
		// System.out.println(Color.RED == 0); 컴오류
		System.out.println(Color.RED.ordinal()==0); // true 기수를 비교해야 한다.
		
		Test1 obj = new Test1();
		System.out.println(obj.getColor());
		
		obj.setColor(Color.BLUE);
		System.out.println(obj.getColor());
		
		// case에서 enum은 enum명을 생략할 수 있음
		Color color = obj.getColor();
		switch(color) {
		case RED:System.out.println("red"); break;
		case BLUE:System.out.println("blue"); break;
		case GREEN:System.out.println("green"); break;
		}
	}

}

enum Color {
	RED, BLUE, GREEN;
}

class Test1 {
	private Color color = Color.RED;

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
