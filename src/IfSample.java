
public class IfSample {

	public static void main(String[] args) {
		System.out.print("月を入力：");
		int month = new java.util.Scanner(System.in).nextInt();
		switch (month) {
		case 2:
			System.out.println("29日");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日");
			break;
		default:
			System.out.println("31日");
		}
	}

}
