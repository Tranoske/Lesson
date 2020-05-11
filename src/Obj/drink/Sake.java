package Obj.drink;

public class Sake extends Drink {
	private int alc;
	public Sake(String name, int amount, int alc) {
		super(name, amount);
		this.alc = alc;
	}
	public void show() {
		super.show();
		System.out.println("アルコール度数"+this.alc+"％");
	}
}
