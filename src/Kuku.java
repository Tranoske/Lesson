
public class Kuku {

	public static void main(String[] args) {
		int uhen = new java.util.Random().nextInt(10);
		int sahen = new java.util.Random().nextInt(10);
		int ans = uhen*sahen;
		System.out.println(sahen+"×"+uhen+"＝？？？");
		
		int input = new java.util.Scanner(System.in).nextInt();
		
		if (input == ans ) {
			System.out.println("正解！");
		}
		else {
			System.out.println("は？違う。");
			System.out.println(sahen+"×"+uhen+"＝"+ans);
		}
	}

}
