package Keisho;

public class Dancer extends Character {
	public void dance() {
		System.out.println(this.name+"は踊った");
	}
	
	public void attack(Matango m) {
		m.hp -= 3;
		System.out.println(this.name+"の攻撃");
		System.out.println("3のダメージ！");
		System.out.println("残り:"+m.hp);
	}
}
