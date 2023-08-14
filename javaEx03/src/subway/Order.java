package subway;


import java.util.Map;

public class Order {


	// 빵 종류
	private Map<Integer, String> breadMap = Map.of(1, "플랫브레드", 2, "허니오트",3,"화이트");
	// 플랫브레드 허니오트 화이트
	
	// 고기 종류
	private Map<Integer, String> meatMap = Map.of(1,"닭고기", 2, "돼지고기",3,"소고기",4,"선택 안함");
	// 닭 돼지 소 선택안함
	
	// 야채 종류
	private Map<Integer, String> vegeMap = Map.of(1,"토마토",2,"양상추",3,"오이",4,"피망",5,"양파",6,"피클");
	// 토마토 양상추 오이 피망 양파 피클 
	
	// 치즈 종류 // 선택안함 추가
	private Map<Integer, String> cheeseMap = Map.of(1,"슈레드치즈",2,"아메리칸치즈",3,"체다치즈",4,"선택 안함");
	// 슈레드치즈 아메리칸치즈 체다 치즈 선택안함 
	
	// 소스 종류
	// 스위트 랜치 칠리 소금 후추 올리브오일 선택안함
	private Map<Integer, String> sauceMap = Map.of(1,"스위트",2,"랜치",3,"칠리",4,"소금",5,"후추",6,"올리브 오일",7,"선택 안함");
	
	// 음료 종류
	private Map<Integer, String> drinkMap = Map.of(1, "사이다",2,"콜라",3,"제로 콜라",4,"제로 사이다");
	
	
	// 빵 선택
	// 이하 모든 메서드들은 UI단에서 수가 잘못 입력됐을 때 예외처리 필요
	public String breadOrder(String bread) {
		int input = Integer.parseInt(bread);
		return breadMap.get(input);
	}

	// 빵 굽기 선택
	public String fireOrder(String fire) {
		switch(Integer.parseInt(fire)) {
		case 1: System.out.println("빵을 구워드리겠습니다."); return "1";
		case 2: System.out.println("빵을 안 구운 채로 드리겠습니다."); return "2";
		}
		return null;
	}
	
	// 고기 선택
	public String meatOrder(String meat) {
		int input = Integer.parseInt(meat);
		return meatMap.get(input);
	}

	// 채소 선택
	public String vegeOrder(String vege) {
		int input = Integer.parseInt(vege);
		return vegeMap.get(input);
	}

	// 치즈 선택
	public String cheeseOrder(String cheese) {
		int input = Integer.parseInt(cheese);
		return cheeseMap.get(input);
	}

	// 소스 선택
	public String sauceOrder(String sauce) {
		int input = Integer.parseInt(sauce);
		return sauceMap.get(input);
	}

	// 세트 유무 선택
	public String setUOrder(String setU) {
		int input = Integer.parseInt(setU);
		switch(input) {
		case 1: System.out.println("세트입니다."); return "1";
		case 2: System.out.println("단품입니다."); return "2";
		}
		return null;
	}
	
	// 세트일 때 음료 선택
	public String setDrinkOrder(String setDrink)  {
		int input = Integer.parseInt(setDrink);
		return drinkMap.get(input);
	}
}
