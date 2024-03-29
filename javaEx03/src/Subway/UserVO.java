package Subway;

import java.util.ArrayList;
import java.util.List;

public class UserVO {

	private String bread;
	private String fire;
	private String meat;
	private List<String> vege = new ArrayList<String>();
	private String cheese;
	private String sauce;
	private String setU;
	private String setDrink;
	private String pay;

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

	public List<String> getVege() {
		return vege;
	}

	public void setVege(String vege) {
		this.vege.add(vege);
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
