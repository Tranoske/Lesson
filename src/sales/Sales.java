package sales;

public class Sales {
	private String name;
	private int kingaku;

	//Constracter
	public Sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getKingaku() {
		return kingaku;
	}

	public int getSouryou() {
		int souryou = 500;
		if(kingaku >= 3000) {
			souryou = 0;
		}
		return souryou;
	}
	public int getTotal() {
		int total = 0;
		total = this.kingaku + getSouryou();
		return total;
	}
	public String toString() {
		return "名前:"+this.name+" 購入金額:"+this.kingaku+"円 送料"+getSouryou()+"円";
	}
}
