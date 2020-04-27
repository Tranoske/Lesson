package Sukkiri;

public class Main {

	public static void main(String[] args) {
		String str = new String("Hello, Gaster.");
		System.out.println(str);
		
		Sword s = new Sword();
		s.name="ほんもののナイフ";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "Chara";
		h.hp = 100;
		h.sword = s;
		System.out.println("名前は既に決められています:"+h.name);
		System.out.println("そうび:"+h.sword.name);
		
		
		Wizard w = new Wizard();
		w.name = "かいふく";
		w.hp = 50;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		h.attack(m1);
		w.heal(h);
		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.run();
		h.run();
	}

}
