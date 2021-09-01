package object_master;

public class Wizard extends human{
	
	public Wizard() {
	this.setHealth(50);
	this.intelligence = 8;
	}
	public void heal(human target) {
		target.setHealth(target.getHealth() + this.intelligence);
	}
	public void fireball(human target) {
		target.setHealth(this.intelligence * 3);
	}

}
