package Obj;

public class Nichiji extends Hiduke {
	int ji;
	int hun;
	
	public Nichiji(int tsuki, int hi, int ji, int hun) {
		super(tsuki, hi);
		this.ji = ji;
		this.hun = hun;
	}
	public void show() {
		super.show();
		this.showJikan();
	}
	public void showJikan() {
		System.out.println(this.ji+"時"+this.hun+"分");
	}
}
