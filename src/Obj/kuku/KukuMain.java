package Obj.kuku;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> kms = new ArrayList<KukuMondai>();
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		kms.add(new KukuMondai());
		
		for(KukuMondai km:kms) {
			km.show();;
			try {
				int ans = new java.util.Scanner(System.in).nextInt();
				km.check(ans);
				
			} catch (InputMismatchException e) {
				System.out.println("数字入れんからエラーや。");
				break;
			}
			
		}
	}

}
