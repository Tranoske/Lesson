package Obj;

public class Teacher {
	String name;
	int nen;
	int kumi;
	
	public Teacher(String name, int nen, int kumi) {
		this.name = name;
		this.nen = nen;
		this.kumi = kumi;
	}
	
	public Teacher(String name) {
		this.name = name;
		this.nen = 0;
		this.kumi = 0;
		
	}
	
	
	public void show() {
		if(this.nen == 0 && this.kumi ==0){
			System.out.println("コードネーム"+this.name+" 担任なし");
		}else {
			System.out.println("コードネーム"+this.name+" "+this.nen+"年"+this.kumi+"組担任");
		}
	}
}
