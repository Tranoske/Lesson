package Obj.event;

public class Sankasha {
	private String name;
	private int age;
	
	
	public Sankasha(String name, int age) throws SankashaException{
		if(age < 0) {
			throw new SankashaException("その年齢は入力できないね。");
		}
		if(name.equals("")) {
			throw new SankashaException("名前を入れてね。");
		}
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
