package Obj;

public class Shouhin {
	String name;
	int price;
	public static final double tax=0.1;
	
	public Shouhin(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void show() {
		System.out.println(this.name+" "+this.price+"円");
	}
	public void showtax() {
		double tax = this.price * 0.1;
		System.out.println("消費税は"+tax+"円");
	}
}
