package Obj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		ilist.set(0, 50);
		System.out.println(ilist.get(2));
		System.out.println(ilist.size());
		ilist.remove(1);
		for(int n:ilist) {
			System.out.println(n);
		}
		
		List<String> llist = new LinkedList<String>();
		llist.add("abc");
		llist.add("def");
		llist.add("hgi");
		for(String s:llist) {
			System.out.println(s);
		}

	}

}
