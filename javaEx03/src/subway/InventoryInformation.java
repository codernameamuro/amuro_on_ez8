package subway;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InventoryInformation {
	private Map<String, Integer> breadInven = new LinkedHashMap<String, Integer>();
	private Map<String, Integer> breadPrice = new LinkedHashMap<String, Integer>();
	
	private Map<String, Integer> meatInven = new LinkedHashMap<String, Integer>();
	private Map<String, Integer> meatPrice = new LinkedHashMap<String, Integer>();
	
	private Map<String, Integer> vegeInven = new LinkedHashMap<String, Integer>();
//	private Map<String, Integer> vegePrice = new LinkedHashMap<String, Integer>();
	// 야채는 가격 안받기로함
	
	private Map<String, Integer> cheeseInven = new LinkedHashMap<String, Integer>();
	private Map<String, Integer> cheesePrice = new LinkedHashMap<String, Integer>();
	
	private Map<String, Integer> sauceInven = new LinkedHashMap<String, Integer>();
//	private Map<String, Integer> saucePrice = new LinkedHashMap<String, Integer>();
	// 소스도 안받
	
	private Map<String, Integer> drinkInven = new LinkedHashMap<String, Integer>();
	private Map<String, Integer> drinkPrice = new LinkedHashMap<String, Integer>();
	
	List<Map> invenList = new ArrayList<Map>();
	List<Map> priceList = new ArrayList<Map>();
	
	
	
	public InventoryInformation() {

		// 빵 재고
		breadInven.put("플랫브레드", 100);
		breadInven.put("허니오트", 100);
		breadInven.put("화이트", 100);
		
		// 빵 가격
		breadPrice.put("플랫브레드", 1);
		breadPrice.put("허니오트", 1);
		breadPrice.put("화이트", 1);
		
		// 고기 재고
		meatInven.put("닭고기", 100);
		meatInven.put("돼지고기", 100);
		meatInven.put("소고기", 100);
		
		// 고기 가격
		meatPrice.put("닭고기", 1);
		meatPrice.put("돼고기", 1);
		meatPrice.put("소고기", 1);
		
		// 야채 재고  //토마토 양상추 오이 피망 양파 피클 
		vegeInven.put("토마토", 100);
		vegeInven.put("양상추", 100);
		vegeInven.put("오이", 100);
		vegeInven.put("피망", 100);
		vegeInven.put("양파", 100);
		vegeInven.put("피클", 100);

		// 치즈 재고		// 슈레드치즈 아메리칸치즈 체다 치즈
		cheeseInven.put("슈레드 치즈", 100);
		cheeseInven.put("아메리칸 치즈", 100);
		cheeseInven.put("체다 치즈", 100);
		
		// 치즈 가격
		cheesePrice.put("슈레드 치즈", 1);
		cheesePrice.put("아메리칸 치즈", 1);
		cheesePrice.put("체다 치즈", 1);

		// 소스 재고		// 스위트 랜치 칠리 소금 후추 올리브오일 
		sauceInven.put("스위트", 100);
		sauceInven.put("랜치", 100);
		sauceInven.put("칠리", 100);
		sauceInven.put("소금", 100);
		sauceInven.put("후추", 100);
		sauceInven.put("올리브오일", 100);
		

		// 음료 재고		// 사이다 콜라 제로 콜라 제로 사이다
		drinkInven.put("사이다",100);
		drinkInven.put("콜라",100);
		drinkInven.put("제로 콜라",100);
		drinkInven.put("제로 사이다",100);
		
		// 음료 가격
		drinkPrice.put("사이다", 1);
		drinkPrice.put("콜라", 1);
		drinkPrice.put("제로 콜라", 1);
		drinkPrice.put("제로 사이다", 1);
		
		// 각 재료 재고들로 이루어진 list
		invenList.add(breadInven);
		invenList.add(meatInven);
		invenList.add(vegeInven);
		invenList.add(cheeseInven);
		invenList.add(sauceInven);
		invenList.add(drinkInven);
		
		priceList.add(breadPrice);
		priceList.add(meatPrice);
		priceList.add(drinkPrice);
		
		
	}
	public int getPrice(String name) {
		
		for(Map map : priceList) {
			Set<Map.Entry<String, Integer>> set = map.entrySet();
			Iterator<Map.Entry<String, Integer>> it = set.iterator();
			while(it.hasNext()) {
				Map.Entry<String, Integer> e = it.next();
				if(name == e.getKey()) {
					return e.getValue();
				}
			}
		}
		return 0;
	}	
}