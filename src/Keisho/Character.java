package Keisho;

public abstract class Character {
	String name;
	int hp;
	
	public abstract void attack(Matango m);
	
	public void run() {
		System.out.println(this.name+"は逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
	
	

}
