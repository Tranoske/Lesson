package Obj;

public class Shouhin {
	String name;
	int price;
	
	public void show() {
		System.out.println(this.name+" "+this.price+"円");
	}
	public void showtax() {
		double tax = this.price * 0.1;
		System.out.println("消費税は"+tax+"円");
	}
}
