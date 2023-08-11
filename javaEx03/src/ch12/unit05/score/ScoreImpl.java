package ch12.unit05.score;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ScoreImpl implements Score{
	//private Map<String, ScoreVO> map = new HashMap<String, ScoreVO>(); // 키가 무작위로 출력됨 속도는 제일 빠름 
	//private Map<String, ScoreVO> map = new TreeMap<String, ScoreVO>();   // 키 순서대로
	private Map<String, ScoreVO> map = new LinkedHashMap<String, ScoreVO>(); // 키가 등록된 순서대로
	@Override
	public void insertSCore(String hak, ScoreVO vo) throws MyDuplicationException {
		if(map.containsKey(hak)) {
			throw new MyDuplicationException("등록된 학번입니다");
		}
		
		// map에 저장 
		map.put(hak, vo);
		
	}

	@Override
	public Map<String, ScoreVO> listmaMap() {
		return map;
		
	}

	@Override
	public ScoreVO readScore(String hak) {
		ScoreVO vo = map.get(hak);
		
		return vo;
		
		
	}

	@Override
	public List<ScoreVO> listScore(String name) {
		List<ScoreVO>list=new ArrayList<ScoreVO>();
		
		for(String hak : map.keySet()) {
			ScoreVO vo = map.get(hak);
			if(vo.getName().startsWith(name)) { // 이름 앞 부분은 검색이 됨 
				list.add(vo);
			}
		}
		
		return list;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = map.remove(hak); // 삭제된 데이터를 반환. 없으면 null
		
		return vo!=null;
	}

}
