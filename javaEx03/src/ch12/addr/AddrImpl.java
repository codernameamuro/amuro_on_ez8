package ch12.addr;

import java.util.ArrayList;
import java.util.List;

public class AddrImpl implements Addr{
	private List<AddrVO> list = new ArrayList<AddrVO>();
	@Override
	public void insertAddress(AddrVO vo) throws MyDuplicationException{
		if(readAddress(vo.getName())!=null){
			throw new MyDuplicationException("등록된 정보가 아닙니다");
			
			
		}list.add(vo);
		
		
	}

	@Override
	public List<AddrVO> listaddr() {
	
		return list;
	}

	@Override
	public AddrVO readAddress(String name) {
		for(AddrVO vo : list) {
			if(vo.getName().equals(name)) {
				return vo;
				
			}
		}
		return null;
	}


	@Override
	public boolean deleteAddr(String name) {
		AddrVO vo = readAddress(name);
		if(vo==null) {
			return false;
			
		}
		list.remove(vo);
		
		return true;
	}

	@Override
	public List<AddrVO> listaddr(String name) {
		List<AddrVO>listname = new ArrayList<AddrVO>();
		
		for(AddrVO vo : list) {
			if(vo.getName().indexOf(name)!=-1) {
				listname.add(vo);
			}
		}
		return listname;
	}



}
