package db.member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = dao.findAll();
		for(Member m:list) {
			System.out.println(m.getMid()+" "+m.getName());
		}
		
		System.out.print("Midを入力して住所をゲット！");
		int ipt = new java.util.Scanner(System.in).nextInt();
		Member m = dao.findByMid(ipt);
		System.out.println(m.getAdr());
		
	}

}
