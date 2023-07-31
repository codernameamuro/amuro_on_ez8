package ch06.score;

public class ScoreVO {  // value object --> 
	// 필드(인스턴스 필드)
	// private : 해당 클래스에서만 접근 가능
	private String hak;  // 객체 생성시점에 메모리 할당, 소멸은 해당 객체가 사용되지 않을때
	private String name;
	private int kor;
	private int eng;
	private int math;
	

	// getter / setter : <shift> + <alt> + <s> + <r> // 필드에 접근하는 메소드
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) { // 매개변수 / 지역변수 지역을 벗어나면 사라짐   // 메소드를 부를때 메모리를 할당 받음 
		this.hak = hak;  // this"." --> 필드변수와 동일함 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTot() {   // 총점
		return kor+eng+math;
	}
	
	public int getAve() {  // 평균
		return getTot()/3;
	}


}
