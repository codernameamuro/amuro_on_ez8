package ch12.addr;

import java.util.List;

public interface Addr {
	public void insertAddress(AddrVO vo)throws MyDuplicationException; // 데이터 등록
	
	public List<AddrVO> listaddr(); // 전체 리스트
	
	public AddrVO readAddress(String name); // 이름, 전화번호 검색
	
	public boolean deleteAddr(String name); // 주소 삭제
	
	public List<AddrVO> listaddr(String name); // 
	

}
