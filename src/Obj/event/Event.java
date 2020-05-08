package Obj.event;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {
	private String name;
	private Date hi = new Date();
	ArrayList<Sankasha> s = new ArrayList<Sankasha>();

	public Event(String name) {
		this.name = name;
	}
	
	public void add(Sankasha s) {
		this.s.add(s);
	}

	public void show() {
		System.out.println(this.name);
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(hi));
		for (Sankasha sankasha:s) {
			System.out.println(sankasha.getName()+"  "+sankasha.getAge()+"歳");
		}
	}

}