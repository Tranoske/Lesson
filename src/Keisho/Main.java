package Keisho;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp=100;
		System.out.println(h);
		
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp=100;
		System.out.println(h2);
		
		if(h.equals(h2)) {
			System.out.println("おなーじ");
		}else {
			System.out.println("違う");
		}
		
		Character c = new SuperHero();
		
		Matango m1 = new Matango();
		Character c1 = new Dancer();
		Character c2 = new Hero();
		
		ArrayList<Character> list = new ArrayList<Character>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		
		for(Character ch:list) {
			ch.attack(m1);
		}
		
		Character csh = new SuperHero();
		if(csh instanceof SuperHero) {
			SuperHero sh = (SuperHero)csh;
			sh.fly();
		}
		
		
//		Hero h = new Hero("Chara");
//		
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//		
//		sh.attack(m1);
//		sh.fly();
//		sh.attack(m1);
//		sh.land();
//		sh.run();
//		h.run();
	}

}
