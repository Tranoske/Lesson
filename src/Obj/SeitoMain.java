package Obj;

import java.util.ArrayList;

public class SeitoMain {

	public static void main(String[] args) {
		int total = 0;
		ArrayList<Chugakusei> cs = new ArrayList<Chugakusei>();
		cs.add(new Chugakusei("田中",80,70,50,9));
		cs.add(new Chugakusei("山田",20,70,40,90));
		cs.add(new Chugakusei("毛利",0,0,0,200));
		
		for(Chugakusei c:cs) {
			c.show();
			total += c.goukei();
		}
		
		System.out.println("全員の合計は"+total);
	}
}
