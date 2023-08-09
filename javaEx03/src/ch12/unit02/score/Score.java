package ch12.unit02.score;

import java.util.List;

public interface Score {
	public void insertScore(Score vo);  // 데이터등록
	public List<ScoreVO> listScore();   // 전체 리스트
	public ScoreVO readScore(String hak); // 학번 검색
	public boolean deleteScore(String hak); //   삭제
	public List<ScoreVO> listScore(String name); // 이름 검색


}
