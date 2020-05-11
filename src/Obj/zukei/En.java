package Obj.zukei;

public class En implements Zukei {
	int hankei;
	public En(int hankei) {
		this.hankei = hankei;
	}
	
	@Override
	public String toString() {
		return "〇 [半径=" + hankei + "]";
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof En) {
			En e = (En)o;
			if(this.hankei == e.hankei) {
				return true;
			}
		}
		return false;
	}

	public void menseki() {
		double enmenseki = this.hankei*this.hankei*3.14;
		System.out.println("円の面積は"+enmenseki);
	}
	public void enshu() {
		double enshu = 2*3.14*this.hankei;
		System.out.println("円周は"+enshu);
	}

}
