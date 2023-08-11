package ch12.unit05.score;

import java.util.List;
import java.util.Map;

public interface Score {
	public void insertSCore(String hak, ScoreVO vo) throws MyDuplicationException;
	public Map<String, ScoreVO>listmaMap();
	public ScoreVO readScore(String hak);
	public List<ScoreVO> listScore(String name);
	public boolean deleteScore(String hak);
	
	
}
