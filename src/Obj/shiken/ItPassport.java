package Obj.shiken;

public class ItPassport extends Shiken{
	public ItPassport() {
		super("ITパスポート");
	}
	int tensu;
	
	@Override
	void showGokaku() {
		// TODO 自動生成されたメソッド・スタブ
		if (this.tensu >= 70) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
	
}
