package Obj;

public class Teacher {
	String name;
	int nen;
	int kumi;
	
	public Teacher(){
		name = "田中、コードネームtnk。";
		nen = 1;
		kumi = 1;
	}
	public void show() {
		if(this.nen == 0 && this.kumi ==0){
			System.out.println(this.name+" 担任なし");
		}else {
			System.out.println(this.name+" "+this.nen+"年"+this.kumi+"組担任");
		}
	}
}
