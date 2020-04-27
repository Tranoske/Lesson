package Obj;

public class Uriage {
	int kosu;
	Shouhin shouhin;
	
	public void show() {
		System.out.println(this.shouhin.name+"が"+this.kosu+"個売れた");
	}
	
	public void showUriage() {
		System.out.println(this.shouhin.price * this.kosu+"円");
	}
}
