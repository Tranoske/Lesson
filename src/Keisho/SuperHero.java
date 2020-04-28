package Keisho;

public class SuperHero extends Hero{
	boolean flying;
	
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタ");
	}
	
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
			flying = false;
		}
	}
	public void fly() {
		this.flying = true;
		System.out.println("飛んでます");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("飛んでないんだよなあ");
	}
	public void run() {
		System.out.println(this.name+"は休戦した、、、");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
}
