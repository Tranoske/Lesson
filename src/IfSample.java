
public class IfSample {

	public static void main(String[] args) {
		System.out.println("点数を入力してください。");
		int num = new java.util.Scanner(System.in).nextInt();
		if (num > 100 || num < 0) {
			System.out.println("んなアホな、、。");
		}
		else if (num >= 80) {
			System.out.println("A評価となります");
		}
		else if (num >= 60) {
			System.out.println("B評価となります");
		}
		else{
			System.out.println("C評価となります");
		}
	}

}
