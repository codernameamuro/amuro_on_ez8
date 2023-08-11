package subway;

import java.util.List;

public interface Sandwich {
	
	
	
	
	
	/////////////////////////////////////////
	// 빵 선택
	public void breadOrder(String bread);

	// 빵 굽기 선택
	public void fireOrder(String fire);
	
	// 고기 선택
	public void meatOrder(String meat);

	// 채소 선택
	public void vegeOrder(String vege);

	// 치즈 선택
	public void cheeseOrder(String cheese);

	// 소스 선택
	public void sauceOrder(String sauce);

	// 세트 유무 선택
	public void setUOrder(String setU);
	
	// 세트 음료 선택
	public void setDrinkOrder(String setDrink) ;
	////////////////////////////////////////////////
	
	//////////////////////////////////////
	// 결제
	public void payOreder(String pay);
	
	// 번호표
	public int lineNumber();
	/////////////////////////////////////// 
	
	/////////////////////////////////////
	// 재고 리스트
	public List<String> showInven();
	
	// 난수 생성해서 무작위로 출력
	public int people();
	
	// 판매량
	public List<String> sell();
	

	/////////////////////////////////////
	



}
