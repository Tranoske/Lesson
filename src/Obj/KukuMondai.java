package Obj;

public class KukuMondai {
	int num1;
	int num2;
	
	public KukuMondai() {
		num1 = new java.util.Random().nextInt(9)+1;
		num2 = new java.util.Random().nextInt(9)+1;
	}
	
	public void show() {
		System.out.print(num1+"×"+num2+"＝");
	}
	public void check(int kotae) {
		if (kotae == num1*num2) {
			System.out.println("せいかい！");
		}else {
			System.out.println("は？違う。");
			System.out.println(num1*num2);
		}
	}
}
