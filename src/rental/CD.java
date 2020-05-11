package rental;

public class CD extends Item{

	public CD(String name, int days) {
		super(name, days);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getPrice() {
		return (super.getDays() -1) * 100 + 300;
	}
	
}
