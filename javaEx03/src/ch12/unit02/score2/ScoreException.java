package ch12.unit02.score2;

// 점수가 0~100이 아닐 때, 잘못 입력 된 점수에 대한 예외
public class ScoreException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ScoreException(String msg) {
		super(msg);
	}

}
