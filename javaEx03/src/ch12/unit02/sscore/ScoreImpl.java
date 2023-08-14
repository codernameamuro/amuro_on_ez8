package ch12.unit02.sscore;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<ScoreVO>();

	@Override
	public void insertScore(ScoreVO vo) {
		list.add(vo);

	}

	@Override
	public List<ScoreVO> listScore() {
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {
		// 학번 검색
		for (ScoreVO vo : list) {
			if (vo.getHak().equals(hak)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = readScore(hak);
		if (vo == null) { // 학번의 데이터가 없으면
			return false;
		}
		
		// 삭제
		list.remove(vo);

		return true;

	}

	@Override
	public List<ScoreVO> listScore(String name) {
		// 이름 검색
		List<ScoreVO> listName = new ArrayList<ScoreVO>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().indexOf(name)!=-1) {
				listName.add(vo);
			}
		}

		return listName;
	} // 인스턴스 필드는 무조건 private로 만든다

}