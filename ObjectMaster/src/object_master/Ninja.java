package object_master;

public class Ninja extends human {
	private int stealth = 10;
	
	public void steal(human target) {
		this.setStealth(target.getHealth());
		target.setHealth(target.getHealth() - this.getStealth());
	}
	public void runAway() {
		this.setHealth(-10);
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	

}
