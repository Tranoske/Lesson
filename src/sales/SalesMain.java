package sales;

import java.util.ArrayList;

public class SalesMain {

	public static void main(String[] args) {
		ArrayList<Sales> list = new ArrayList<Sales>();
		list.add(new Sales("田中", 1500));
		list.add(new Sales("山田", 3000));
		list.add(new MemberSales("鈴木", 1000));

		for(Sales s:list) {
			System.out.println(s.toString());
		}

		int total = 0;
		for(Sales s:list) {
			total += s.getTotal();
			System.out.println(s.getName()+" "+s.getKingaku()+"円 送料"+s.getSouryou()+"円");
		}
		System.out.println("合計 "+total+"円");

	}

}
