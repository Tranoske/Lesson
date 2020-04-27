package Obj;

public class En {
	int hankei;
	public void menseki() {
		double enmenseki = this.hankei*this.hankei*3.14;
		System.out.println("円の面積は"+enmenseki);
	}
	public void enshu() {
		double enshu = 2*3.14*this.hankei;
		System.out.println("円周は"+enshu);
	}

}
