package ch12.addr;

public class AddrVO {
	private String name;
	private String birth;
	private String tel;
	private String address;
	private String uploaddate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirht() {
		return birth;
	}
	public void setBirht(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUploaddate() {
		return uploaddate;
	}
	public void setUploaddate(String uploaddate) {
		this.uploaddate = uploaddate;
	}
	@Override
		public String toString() {
			String s = name+"\t"+tel+"\t"+birth+"\t"+address+"\t"+uploaddate;
		
		return s;
		
	}
	

}
