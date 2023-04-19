package godonguk.submit_11;

public class Character {
	String name;		// 캐릭터이름
	int bossCount;		// 보스 잡는 수 
	long bossMeso;		// 보스 메소
	
	public Character() {}
	
	public Character(String name, int bossCount, long bossMeso) {
		super();
		this.name = name;
		this.bossCount = bossCount;
		this.bossMeso = bossMeso;
	}

	@Override
	public String toString() {
		return "[닉네임: " + name + ", 잡은 보스 수: " + bossCount + ", 결정석 가격: " + bossMeso + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBossCount() {
		return bossCount;
	}

	public void setBossCount(int bossCount) {
		this.bossCount = bossCount;
	}

	public long getBossMeso() {
		return bossMeso;
	}

	public void setBossMeso(int bossMeso) {
		this.bossMeso = bossMeso;
	}
	
	
	
}
