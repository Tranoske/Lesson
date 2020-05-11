package Obj.zukei;

public class Shikaku implements Zukei{
	int haba;
	int takasa;
	
	public int getHaba() {
		return haba;
	}
	public void setHaba(int haba) {
		this.haba = haba;
	}
	public int getTakasa() {
		return takasa;
	}
	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}
	@Override
	public String toString() {
		return "□ [幅=" + haba + ", 高さ=" + takasa + "]";
	}


	public Shikaku(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}


	public void menseki() {
		System.out.println(this.haba * this.takasa);
		
	}
	
	

}
