package db;

import java.util.ArrayList;

public class DbSample {

	public static void main(String[] args) {
//		ShohinDAO dao = new ShohinDAO();
//		Shohin s = dao.findBySid(3);
//		System.out.println(s.getName());

//		dao.delete(9);

//		ArrayList<Shohin> list = dao.findAll();
//		for(Shohin s:list) {
//			System.out.println(s.getName());
//		}

		UriageDAO udao = new UriageDAO();
		ArrayList<Uriage> list = udao.findAll();
		for(Uriage u:list) {
			System.out.print(u.getUid()+" ");
			System.out.print(u.getSid()+" ");
			System.out.print(u.getKosu()+" ");
			System.out.println(u.getHi());
		}

		System.out.println();

		Uriage fbu = udao.FindByUid(3);
		System.out.print(fbu.getUid()+" ");
		System.out.print(fbu.getSid()+" ");
		System.out.print(fbu.getKosu()+" ");
		System.out.println(fbu.getHi());

		java.util.Date ud = new java.util.Date();
		java.sql.Date sd = new java.sql.Date(ud.getTime());
//		udao.insert(new Uriage(0, 6, 120, sd));

		Uriage u2 = udao.FindByUid(10);
		System.out.print(u2.getUid()+" ");
		System.out.print(u2.getSid()+" ");
		System.out.print(u2.getKosu()+" ");
		System.out.println(u2.getHi());

	}
}