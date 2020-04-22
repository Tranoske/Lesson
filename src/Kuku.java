
public class Kuku {

	public static void main(String[] args) {
		int num1 = new java.util.Random().nextInt(9)+1;
		int num2 = new java.util.Random().nextInt(9)+1;
		int ans = num1 * num2;
		
		System.out.println(num1+"×"+num2+"＝？？");
		
		int input = new java.util.Scanner(System.in).nextInt();
		
		if (input == ans ) {
			System.out.println("正解！");
		}
		else {
			System.out.println("は？違う。");
			System.out.println(num1+"×"+num2+"＝"+ans);
		}
	}

}
