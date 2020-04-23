
public class Coin {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		int[] maisu = new int [coins.length];
		for(int i=0;i<coins.length;i++) {
			System.out.println(coins[i]+"円玉は何枚？");
			maisu[i] = new java.util.Scanner(System.in).nextInt();
		}
		int[] coinsums = new int[6];
		for (int i=0;i<coins.length;i++){
			coinsums[i] = maisu[i]*coins[i];
		}
		int sum = 0;
		for(int value:coinsums) {
			sum += value;
		}
		System.out.println(sum+"円");
	}
}
