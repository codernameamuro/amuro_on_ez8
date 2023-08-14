package subway;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SandwichImpl implements Sandwich{
	private UserVO userVO = new UserVO();
	private List<UserVO> list = new ArrayList<>();
	LocalDateTime dateTime = LocalDateTime.now();
	
	//
	@Override
	public int setLineNumber() {
		int lineNumber = userVO.getLineNubmer();
		lineNumber = lineNumber + 1;
		
		if(lineNumber > 10) {
			lineNumber = 0;
		}
		
		userVO.setLineNubmer(lineNumber);
		
		return lineNumber;
	}
	
	@Override
	public void payOreder(String pay) {
		
		
	}
	
	
	
	@Override
	public void breadOrder(String bread) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fireOrder(String fire) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void meatOrder(String meat) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vegeOrder(String vege) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cheeseOrder(String cheese) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sauceOrder(String sauce) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setUOrder(String setU) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDrinkOrder(String setDrink) {
		// TODO Auto-generated method stub
		
	}
	// 재고리스트
	@Override
	public List<UserVO> showInven() {
		// TODO Auto-generated method stub
		return list;
	}
	
	// 직원 수
	@Override
	public int people() {
		int h = dateTime.getHour();
		if(h>=06 && h<=12) {
			System.out.println("2명입니다");
		}else if(h>=13 && h<=18) {
			System.out.println("4명입니다");
		}else if(h>=19 && h<=21) {
			System.out.println("3명입니다");
		}else {
			System.out.println("0 명, 영업이 종료됐습니다");
		}
		
		return 0;
	}
	
	// 방문자수?
	@Override
	public List<String> sell() {
		return null;
	}
	

}
