package db;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class DbSample {
	public static void main(String[] args) {
		//全表示
//		ShohinDAO dao = new ShohinDAO();
//		ArrayList<Shohin> slist = dao.findAll();
//		for(Shohin s:slist) {
//			System.out.println(s.getName());
//		}
//		//1つ検索
//		Shohin s = dao.findBySid(1);
//		System.out.println(s.getName());
//		
//		//追加
////		Shohin s1 = new Shohin(0,"うまい棒",10);
////		dao.insert(s1);
//		
//		//変更
//		Shohin s2 = new Shohin(4,"メロン",600);
//		
//		//削除
//		dao.delete(4);
		
		
		
//		ShohinDAO dao = new ShohinDAO();
//		Shohin s = dao.findBySid(3);
//		System.out.println(s.getName());

//		dao.delete(9);

//		ArrayList<Shohin> list = dao.findAll();
//		for(Shohin s:list) {
//			System.out.println(s.getName());
//		}
		
		//全部出し
		UriageDAO udao = new UriageDAO();
		ArrayList<Uriage> list = udao.findAll();
		for(Uriage u:list) {
			System.out.print(u.getUid()+" ");
			System.out.print(u.getSid()+" ");
			System.out.print(u.getKosu()+" ");
			System.out.println(u.getHi());
		}

		System.out.println();

		//uidでfindby
		Uriage fbu = udao.FindByUid(3);
		System.out.print(fbu.getUid()+" ");
		System.out.print(fbu.getSid()+" ");
		System.out.print(fbu.getKosu()+" ");
		System.out.println(fbu.getHi());
		
		//sidでfindby
		ArrayList<Uriage> sids = new ArrayList<Uriage>();
		for (Uriage u:sids) {
			System.out.print(u.getUid()+" ");
			System.out.print(u.getSid()+" ");
			System.out.print(u.getKosu()+" ");
			System.out.println(u.getHi());
		}
		
		
		//追加
		java.util.Date ud = new java.util.Date();
		java.sql.Date sd = new java.sql.Date(ud.getTime());
//		udao.insert(new Uriage(0, 6, 120, sd));
		
		//変更
		Calendar c = Calendar.getInstance();
		c.set(2020, 4-1, 1);
		Date hi = new Date(c.getTimeInMillis());
		Uriage u3 = new Uriage(5,3,2,hi);
		
		//削除
		udao.delete(7);

	}
}