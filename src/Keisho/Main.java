package Keisho;

public class Main {

	public static void main(String[] args) {
		SuperHero h = new SuperHero();
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		h.attack(m1);
		h.fly();
		h.land();
		h.run();
	}

}
