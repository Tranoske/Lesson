package Obj.drink;

public class Drink {
	private String name;
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Drink(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	public void show() {
		System.out.println(name+"　"+amount+"ml");
	}
	
	
	
	
	
}
