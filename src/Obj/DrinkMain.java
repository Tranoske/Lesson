package Obj;

import java.util.ArrayList;

public class DrinkMain {	
	public static void main(String[] args) {
		int total = 0;
		
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		drinks.add(new Drink("コーラ",500));
		drinks.add(new Drink("サイダー",350));
		drinks.add(new Drink("コーヒー",350));
		
		for(Drink d:drinks) {
			d.show();
			total += d.amount;
		}
		
		System.out.println("合計　"+total+"ml");
		
	}

}
