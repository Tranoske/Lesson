package Obj;

public class Seito {
	String name;
	int kokugo;
	int sansu;
	int syakai;
	
	public void show() {
		System.out.println(this.name+"　国語"+this.kokugo+"点　算数"+this.sansu+"点　社会"+this.syakai+"点");
	}
	
	public int goukei() {
		int goukei = this.kokugo+this.sansu+this.syakai;
		return goukei;
	}
	
	public double heikin() {
		double heikin =this.goukei()/3.0;
		return heikin;
	}
}
