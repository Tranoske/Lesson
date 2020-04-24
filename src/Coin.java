
public class Coin {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		int sum=0;
		for (int coin:coins) {
			int maisu = inputMaisu(coin);
			sum += coin*maisu;
		}
		System.out.println("合計："+sum);
		
	}
	public static int inputMaisu(int coin) {
		System.out.println(coin+"円玉は何枚？");
		int maisu = new java.util.Scanner(System.in).nextInt();
		return maisu;
	}
}
