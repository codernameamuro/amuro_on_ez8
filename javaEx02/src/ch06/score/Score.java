package ch06.score;

public class Score { // 데이터를 보관하는 곳 
	// ScoreVO 객체를 100개 지정할 수 있는 배열
	private ScoreVO[] list = new ScoreVO[100]; //필드
	// 저장된 인원수
	private int count;

	// 배열에 ScoreVO 객체를 추가
	public int append(ScoreVO vo) {
		if (count >= list.length) {
			return -1;              // 100명이 다 차면 
		}

		list[count++] = vo;

		return count;
	}

	// 인원수 반환
	public int getCount() {  
		return count;
	}

	// 배열의 객체 반환
	public ScoreVO[] getList() {
		return list;
	}

	// 한 번 조건에 일치하는 ScoreVO 객체 반환
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;

		return vo;
	}

	// list 배열에서 ScoreVO 객체 삭제
	public boolean deleteScore(ScoreVO vo) {
		boolean result = false;

		return result;
	}
	
	public double grade(int score) {
		double result;
		
		if(score>=95) result = 4.5;
		else if(score>=90) result = 4.0;
		else if(score>=85) result = 3.5;
		else if(score>=80) result = 3.0;
		else if(score>=75) result = 2.5;
		else if(score>=70) result = 2.0;
		else if(score>=65) result = 1.5;
		else if(score>=60) result = 1.0;
		else result = 0.0;		
		
		return result;
		
	}

}
