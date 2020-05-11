package Obj.drink;

import java.util.ArrayList;

public class DrinkMain {	
	public static void main(String[] args) {
		int total = 0;
		
		Sake s = new Sake("ストロングゼロ", 500, 9);
		s.show();
		
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		drinks.add(new Drink("コーラ",500));
		drinks.add(new Drink("サイダー",350));
		drinks.add(new Drink("コーヒー",350));
		drinks.add(new Sake("フォーナイン", 500, 99));
		
		for(Drink d:drinks) {
			d.show();
			total += d.getAmount();
		}
		
		System.out.println("合計　"+total+"ml");
		
	}

}
