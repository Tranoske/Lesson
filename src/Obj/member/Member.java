package Obj.member;

public class Member {
	String name;
	String tel;
	
	@Override
	public String toString() {
		return name + ", " + tel;
	}

	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
}
