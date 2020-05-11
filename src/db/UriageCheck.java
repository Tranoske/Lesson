package db;

import java.util.ArrayList;

public class UriageCheck {

	public static void main(String[] args) {
		ShohinDAO dao = new ShohinDAO();
		ArrayList<Shohin> list = dao.findAll();
		for(Shohin s:list) {
			System.out.print(s.getSid()+" ");
			System.out.println(s.getName());
		}
		
		System.out.println("どの売り上げを見たいですか？");
		int ipt = new java.util.Scanner(System.in).nextInt();
		
		
		UriageDAO udao = new UriageDAO();
		Uriage u = udao.FindBySid(ipt);
		System.out.print(u.getHi()+" ");
		System.out.println(u.getKosu());
		
	}

}
