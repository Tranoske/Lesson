package Obj;

public class KujiMain {

	public static void main(String[] args) {
		Kuji n1 = new Kuji();
		n1.no = 123456;
		Kuji n2 = new Kuji();
		n2.no = 101012;
		Kuji n3 = new Kuji();
		n3.no = 654321;
		
		KujiChecker kc = new KujiChecker();
		kc.check(n1);
		kc.check(n2);
		kc.check(n3);
		
		n1.show();
		n2.show();
		n3.show();
		
		System.out.println("合計:"+kc.kin+"円");
	}

}
