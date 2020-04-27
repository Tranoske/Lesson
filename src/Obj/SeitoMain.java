package Obj;

public class SeitoMain {

	public static void main(String[] args) {
		Seito tnk = new Seito();
		tnk.name = "田中";
		tnk.kokugo = 80;
		tnk.sansu = 70;
		tnk.syakai = 50;
		
		tnk.show();
		
		System.out.println("合計:"+tnk.goukei()+"点");
		
		System.out.println("平均:"+tnk.heikin()+"点");

	}

}
