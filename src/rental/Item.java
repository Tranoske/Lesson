package rental;

public abstract class Item {
	private String name;
	private int days;
	
	public String getName() {
		return name;
	}
	public int getDays() {
		return days;
	}
	
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
