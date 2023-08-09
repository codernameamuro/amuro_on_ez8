package ch12.unit02.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<ScoreVO>(); // 인스턴스 필드는 무조건 private로 만든다

	@Override
	public void insertScore(Score vo) {
		// List 객체의 마지막에 요소를 추가
		list.add(vo);

	}

	@Override
	public List<ScoreVO> listScore() {
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {

		return null;
	}

	@Override
	public boolean deleteScore(String hak) {

		return false;
	}

	@Override
	public List<ScoreVO> listScore(String name) {

		return null;
	} // 구현 클래스

}
