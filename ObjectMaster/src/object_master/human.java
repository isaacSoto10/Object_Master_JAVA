package object_master;

public class human {
	protected int strength = 3;
	protected int stealt = 3;
	protected int intelligence = 3;
	
	private int health = 100;
	
	public void attack(human target) {
		target.setHealth((target.getHealth() - this.strength));
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
