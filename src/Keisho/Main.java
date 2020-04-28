package Keisho;

public class Main {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Hero h = new Hero();
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		sh.attack(m1);
		sh.fly();
		sh.attack(m1);
		sh.land();
		sh.run();
		h.run();
	}

}
