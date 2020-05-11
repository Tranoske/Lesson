package Obj.member;

import Obj.zukei.En;

public class MemberMain {

	public static void main(String[] args) {
		
		Member tnk = new Member("田中","096-111-2222");
		System.out.println(tnk);
		En en = new En(10);
		en.menseki();
		
		NetMember ntnk = new NetMember("田中","095-111-2222","tnk@tanaka.cn");
		System.out.println(ntnk);
	}
}