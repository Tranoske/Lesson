package Obj;

import Obj.zukei.En;
import Obj.zukei.Sankaku;

public class Main {

	public static void main(String[] args) {
		Teacher ti = new Teacher("TNK",1,1);
		ti.show();
		
		Teacher ti2 = new Teacher("田中",2,1);
		ti2.show();
		
		Teacher ti3 = new Teacher("YMD",3,2);
		ti3.show();
		
		Teacher ti4 = new Teacher("山田");
		ti4.show();
		
		Hiduke hi = new Hiduke(4,27);
		hi.show();
		
		Hiduke hi2 = new Hiduke(5,7);
		hi2.show();
		
		Nichiji ni = new Nichiji(4,28,13,30);
		ni.show();
		
		DenshiMoney m = new DenshiMoney();
		m.charge(1000);
		m.buy(1000);
		
		System.out.println("残高:"+m.getKingaku()+"円");
		System.out.println(m.getPoint()+"ポイント");
		

		System.out.println("残高:"+m.getKingaku()+"円");
		System.out.println(m.getPoint()+"ポイント");
		
		m.change();
		System.out.println("残高:"+m.getKingaku()+"円");
		System.out.println(m.getPoint()+"ポイント");
		
		Sankaku s = new Sankaku(2,1);
		s.menseki();
		
		En e = new En(10);
		e.menseki();
		e.enshu();
		
		Book b = new Book("それから",500,"夏目漱石");
		
		Shouhin syo = new Shouhin("りんご",100);
		syo.show();
		syo.showtax();
		
		Uriage age = new Uriage();
		age.kosu = 5;
		age.shouhin = syo;
		age.shouhin = b;
		age.show();
		
		Shouhin msyo = new Shouhin("みかん",150);
		
		
		Uriage mage = new Uriage();
		mage.shouhin = msyo;
		mage.kosu = 3;
		mage.show();
		mage.showUriage();
		
	}

}