package godonguk.submit_11;

public class BossReward {
	String boss;	// 보스이름
	long price;		// 보스가격 
	
	public BossReward() {}
	
	public BossReward(String boss, int price) {
		super();
		this.boss = boss;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[보스이름: " + boss + ", 결정석 가격: " + price + "메소 ]";
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
