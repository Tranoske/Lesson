package rental;

import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Book("ワンピーヌ",7));
		items.add(new CD("パプリ力",3));
		items.add(new CD("Lemonn",1));
		
		for(Item i:items) {
			System.out.println(i.name+"  "+i.days+"日 "+i.getPrice()+"円");
		
		}

	}

}
