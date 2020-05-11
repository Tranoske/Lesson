package Obj.zukei;

public class Sankaku implements Zukei {
	private int teihen;
	private int takasa;
	
	public int getTeihen() {
		return teihen;
	}
	public void setTeihen(int teihen) {
		this.teihen = teihen;
	}	
	public int getTakasa() {
		return takasa;
	}
	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}
	
	@Override
	public String toString() {
		return "△ [底辺=" + teihen + ", 高さ=" + takasa + "]";
	}

	public Sankaku(int teihen, int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

	public void menseki() {
		int menseki = this.teihen * this.takasa /2;
		System.out.println("面積："+menseki);
	}
}
