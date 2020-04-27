package Obj;

public class KujiChecker {
	int kin;
	public void check(Kuji k) {
		if (k.no == 123456){
			this.kin += 100000;
			k.tou = "1等";
		}else if (k.no % 100 == 12 ) {
			this.kin += 1000;
			k.tou = "2等";
		}else {
			k.tou = "はずれ";
		}
	}
}
