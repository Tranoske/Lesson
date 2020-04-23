
public class Loop {

	public static void main(String[] args) {
		System.out.println("その数まで表示");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=input;i++) {
			System.out.println(i);
		}
		
		
//		System.out.println("倍にするよ！0で終了。");
//		while(true){
//			int num = new java.util.Scanner(System.in).nextInt();
//			if(num == 0) {
//				break;
//			}
//			System.out.println(num*2);
//		}
//		
//		for (int i=1; i<=10; i++) {
//			if (i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		System.out.println(i);
//		
//		for (int i=1; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.print(i*j);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
	}

}
