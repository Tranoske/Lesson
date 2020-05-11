package Sukkiri;

public class Main {

	public static void main(String[] args) {
		Hero.money = 500;
		Sword s = new Sword("ほんもののナイフ",10);
		Hero h = new Hero("Frisk");
		Hero h2 = new Hero("Mintia");
		
		Hero.setRandomMoney();
		
		
		System.out.println(Hero.money);
		
//		h.setName("Chara");
//		h.setSword(s);
//		
//		System.out.println("名前は既に決められています:"+h.getName());
//		System.out.println("そうび:"+h.getSword().getName());
//		
//		System.out.println(h.getHp());
//		h.setHp(-100);
//		h.die();
//		h.slip();
//		System.out.println(h.getHp());
//		Wizard w = new Wizard();
//		w.name = "かいふく";
//		w.hp = 50;
//		
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//		
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//		
//		h.attack(m1);
//		w.heal(h);
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		m1.run();
//		m2.run();
//		h.run();
	}

}
