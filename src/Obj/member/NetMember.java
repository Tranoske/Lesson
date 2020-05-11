package Obj.member;

public class NetMember extends Member {
	String mail;
	
	@Override
	public String toString() {
		return super.toString()+", "+ mail;
	}
	public NetMember(String name, String tel, String mail) {
		super(name, tel);
		this.mail = mail;
	}

}