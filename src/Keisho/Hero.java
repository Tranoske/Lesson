package Keisho;

public class Hero extends Character {	
	public Hero() {
	}
	
	public Hero(String name) {
		this.name = name;
		System.out.println("Heroのコンストラクタ");
	}
	
	public void attack(Matango m) {
		m.hp -= 5;
		System.out.println(this.name+"の攻撃");
		System.out.println("5のダメージ！");
		System.out.println("残り:"+m.hp);
	}
	
	public String toString() {
		return "名前："+this.name;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name+"は"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した！");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name+"は転んだ！");
		System.out.println("5のダメージ！");
	}
}
