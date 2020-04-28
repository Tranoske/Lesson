package Keisho;

public class SuperHero extends Hero{
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛んでます");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("飛んでないんだよなあ");
	}
}
