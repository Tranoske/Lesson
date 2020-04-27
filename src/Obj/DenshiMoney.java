package Obj;

public class DenshiMoney {
	int kingaku;
	int point;
	
	public void charge(int m) {
		this.kingaku += m;
	}
	
	public void buy(int m) {
		if(kingaku < m) {
			System.out.println(-(kingaku-m)+"円不足しています");
		}else {
		this.kingaku -= m;
		this.point +=(int)(m * 0.05);
		}
	}
	public void change() {
		kingaku += point;
		point = 0;
	}
}
