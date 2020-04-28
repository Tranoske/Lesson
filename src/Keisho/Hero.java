package Keisho;

public class Hero {
	String name = "Chara";
	int hp=100;
	
	public void attack(Matango m) {
		m.hp -= 5;
		System.out.println(this.name+"の攻撃");
		System.out.println("5のダメージ！");
		System.out.println("残り:"+m.hp);
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
	public void run() {
		System.out.println(this.name+"は逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
}
