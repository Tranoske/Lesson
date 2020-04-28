package Obj;

public class Sankaku {
	int teihen;
	int takasa;
	
	public Sankaku(int teihen, int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

	public void menseki() {
		int menseki = this.teihen * this.takasa /2;
		System.out.println("面積："+menseki);
	}
}
