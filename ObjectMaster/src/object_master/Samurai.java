package object_master;

public class Samurai extends human {
	static int samuraiCount = 0;
	
	//Constructor
	public Samurai() {
		this.setHealth(200);
		samuraiCount +=1;
	}
	
	//Methods
	public void deathBlow(human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println("BOOM!");
	}
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth()/2);
		System.out.println("("+ " channeled their warrior spirit, healing for " + this.getHealth() / 2 + " points!)");
	}
	public int howMany() {
		System.out.println(samuraiCount);
		return samuraiCount;
	}
}