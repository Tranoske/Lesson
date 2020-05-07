package rental;

public abstract class Item {
	String name;
	int days;
	
	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}

	@Override
	public String toString() {
		return name + "  " + days + "日" + "  "+ getPrice();
	}



	public abstract int getPrice();

}
