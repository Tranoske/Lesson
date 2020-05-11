package Sukkiri;

public class Sword {
	private String name;
	private int damage;
	
	public String getName() {
		return this.name;
	}
	public int getDamage() {
		return this.damage;
	}
	
	public Sword(String name,int dmg) {
		this.name = name;
		this.damage = dmg;
	}
	
}
