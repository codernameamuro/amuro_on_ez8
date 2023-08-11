package subway;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class AddminP {
	private List<UserVO> list = new ArrayList<>();
	private UserVO user = new UserVO();
	LocalDateTime dateTime = LocalDateTime.now(); 
	
	// 재고 리스트
	public List<UserVO> showInven(){
		return list;
	};
	
	// 난수 생성해서 무작위로 출력
	public int people() {
		
		int h = dateTime.getHour();
		if(h>06 && h<12) {
			System.out.println("2명입니다");
		}else if(h>13 && h<18) {
			System.out.println("4명입니다");
		}else if(h>19 && h<21) {
			System.out.println("3명입니다");
		}else {
			System.out.println("0 명, 영업이 종료됐습니다");
		}
		
		return 0;
	};
	
	// 판매량
	//public int sell(){
		
	//	return user.getCount();
	};
	

//}
