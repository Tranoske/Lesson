package Obj.seito;

public class Chugakusei extends Seito {
	int eigo;
	public Chugakusei(String name, int kokugo, int sansu, int syakai, int eigo) {
		super(name, kokugo, sansu, syakai);
		this.eigo = eigo;
	}
	
	public void show() {
		super.show();
		System.out.println("点　英語"+this.eigo+"点");
	}
	
	public int goukei() {
		int goukei = super.goukei()+this.eigo;
		return goukei;
	}
	
	public double heikin() {
		double heikin =this.goukei()/4.0;
		return heikin;
	}
}
