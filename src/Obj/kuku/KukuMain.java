package Obj.kuku;

import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> kms = new ArrayList<KukuMondai>();
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		
		for(KukuMondai km:kms) {
			km.show();
			int ans = new java.util.Scanner(System.in).nextInt();
			km.check(ans);
		}
	}

}
