
public class Loop2 {

	public static void main(String[] args) {
		//こんにちは５回
		for(int i=1; i<=5; i++) {
			System.out.print("こんにちは");
		}
		System.out.println();
		//12345
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		//0からnum迄
		System.out.println("その数まで表示");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<=num;i++) {
			System.out.print(i);
		}
		System.out.println();
		//10以下の偶数
		for(int i=2;i<=10;i+=2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		//54321
		for(int i=5;i>=1;i--) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		//1 to 10 sum
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
			System.out.print(sum);
			System.out.print(" ");
		}

	}

}
