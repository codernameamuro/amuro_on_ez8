package ch06.score;

public class Score {
	// ScoreVO 객체를 100개 지정할 수 있는 배열
	private ScoreVO[] list = new ScoreVO[100];
	// 저장된 인원수
	private int count;

	// 배열에 ScoreVO 객체를 추가
	public int append(ScoreVO vo) {
		if (count >= list.length) {
			return -1;
		}

		list[count + 1] = vo;

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

}
