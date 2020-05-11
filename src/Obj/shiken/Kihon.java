package Obj.shiken;

public class Kihon extends Shiken {
	
	public Kihon() {
		super("基本情報");
	}
	
	int gozen;
	int gogo;

	@Override
	void showGokaku() {
		// TODO 自動生成されたメソッド・スタブ
		if (this.gozen >= 60 && this.gogo >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}
	

}
