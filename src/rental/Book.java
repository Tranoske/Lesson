package rental;

public class Book extends Item {
	public Book(String name, int days) {
		super(name, days);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getPrice() {
		return super.getDays() * 50;
	}
	

}
