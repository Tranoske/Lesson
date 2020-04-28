package Obj;

public class Chugakusei extends Seito {
	int eigo;
	public Chugakusei(String name, int kokugo, int sansu, int syakai, int eigo) {
		super(name, kokugo, sansu, syakai);
		this.eigo = eigo;
	}
	
	public void show() {
		System.out.println(super.name+"　国語"+super.kokugo+"点　算数"+super.sansu+"点　社会"+super.syakai+"点　英語"+this.eigo+"点");
	}
	
	public int goukei() {
		int goukei = super.kokugo+super.sansu+super.syakai+this.eigo;
		return goukei;
	}
	
	public double heikin() {
		double heikin =this.goukei()/4.0;
		return heikin;
	}
}
