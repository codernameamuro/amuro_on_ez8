package subway;

public class UserVO {
	
	private String bread;
	private String fire;
	private String meat;
	private String vege;
	private String cheese;
	private String sauce;
	private String setU;
	private String setDrink;
	private String pay;
	private int count;
	private int guest=0;
	
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private int lineNubmer = 0;
	
	public int getLineNubmer() {
		return lineNubmer;
	}
	public void setLineNubmer(int lineNubmer) {
		this.lineNubmer = lineNubmer;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getFire() {
		return fire;
	}
	public void setFire(String fire) {
		this.fire = fire;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getVege() {
		return vege;
	}
	public void setVege(String vege) {
		this.vege = vege;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getSetU() {
		return setU;
	}
	public void setSetU(String setU) {
		this.setU = setU;
	}
	public String getSetDrink() {
		return setDrink;
	}
	public void setSetDrink(String setDrink) {
		this.setDrink = setDrink;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}


}
