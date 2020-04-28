package Obj;

public class Hiduke {
	int tsuki;
	int hi;
	
	public Hiduke(int tsuki, int hi) {
		this.tsuki = tsuki;
		this.hi = hi;
	}
	
	public void show() {
		System.out.println(this.tsuki+"月"+this.hi+"日");
	}
}
