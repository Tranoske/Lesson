package Obj.zukei;

import java.util.ArrayList;

public class ZukeiMain {

	public static void main(String[] args) {
		En e1 = new En(10);
		En e2 = new En(10);
		if (e1.equals(e2)) {
			System.out.println("おなし");
		}else {
			System.out.println("ちかう");
		}
		
		
		ArrayList<Zukei> list = new ArrayList<Zukei>();
		list.add(new Shikaku(5,5));
		list.add(new En(10));
		list.add(new Sankaku(5,8));
		
		for(Zukei zk:list) {
//			zk.menseki();
			System.out.println(zk);
			if(zk instanceof En) {
				En en = (En)zk;
				en.enshu();
			}
		}

	}

}
