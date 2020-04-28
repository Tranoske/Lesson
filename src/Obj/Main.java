package Obj;

public class Main {

	public static void main(String[] args) {
		Teacher ti = new Teacher();
		ti.show();
		
		Hiduke hi = new Hiduke();
		hi.tsuki = 4;
		hi.hi = 27;
		hi.show();
		
		Hiduke hi2 = new Hiduke();
		hi2.tsuki = 5;
		hi2.hi = 7;
		hi2.show();
		
		DenshiMoney m = new DenshiMoney();
		m.kingaku=1000;
		m.point=0;
		System.out.println("残高:"+m.kingaku+"円");
		System.out.println(m.point+"ポイント");
		
		m.charge(1000);
		m.buy(1000);
		System.out.println("残高:"+m.kingaku+"円");
		System.out.println(m.point+"ポイント");
		
		m.change();
		System.out.println("残高:"+m.kingaku+"円");
		System.out.println(m.point+"ポイント");
		
		Sankaku s = new Sankaku();
		s.teihen = 2;
		s.takasa = 1;
		s.menseki();
		
		En e = new En();
		e.hankei = 10;
		e.menseki();
		e.enshu();
		
		Shouhin syo = new Shouhin();
		syo.name = "りんご";
		syo.price = 100;
		syo.show();
		syo.showtax();
		
		Uriage age = new Uriage();
		age.kosu = 5;
		age.shouhin = syo;
		age.show();
		
		Shouhin msyo = new Shouhin();
		msyo.name = "みかん";
		msyo.price = 150;
		
		Uriage mage = new Uriage();
		mage.shouhin = msyo;
		mage.kosu = 3;
		mage.show();
		mage.showUriage();
		
	}

}