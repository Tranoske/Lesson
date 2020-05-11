package rental;

import java.util.ArrayList;

public class Rental {
	ArrayList<Item> items = new ArrayList<>();
	
	void add(Item item) {
		this.items.add(item);
	}
	
	void show() {
		for(Item i:items) {
		System.out.println(i.getName()+"  "+i.getDays()+"日 "+i.getPrice()+"円");
		}
	}
	int getGoukei() {
		int sum = 0;
		for(Item i:items) {
			sum += i.getPrice();
		}
		return sum;
	}
}
