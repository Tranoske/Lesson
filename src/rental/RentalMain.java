package rental;

public class RentalMain {

	public static void main(String[] args) {
		Rental r = new Rental();
		r.add(new Book("ワンピーヌ",7));
		r.add(new CD("パプリ力",3));
		r.add(new CD("Lemonn",1));
		
		r.show();
		
		System.out.println("合計："+r.getGoukei()+"円");
		
	}

}
