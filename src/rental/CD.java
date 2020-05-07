package rental;

public class CD extends Item{

	public CD(String name, int days) {
		super(name, days);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getPrice() {
		if (super.days == 1) {
			return 300;
		}else {
			return (super.days -1) * 100 + 300;
		}
	}
	

}
