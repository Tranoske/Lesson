
public class Hairetsu2 {
	
	public static void showKion(double ondo) {
		System.out.println(ondo+"ど");
	}

	public static void main(String[] args) {
		double[] kions = {15,5,20,1,18,3};
		for(double k:kions) {
			showKion(k);
		}
		
		
//		int[] data = {5,8,7,9,6};
//		for(int value:data) {
//			System.out.println(value);
//		}

//		int[] prices = {100,200,150};
//
//		System.out.println(prices.length);
//		
//		for(int i=0;i<3;i++) {
//			int value = prices[i];
//			System.out.println(prices[i]);
//		}
//		for(int value:prices) {
//			System.out.println(value);
//		}
//		
		String[] names = {"コーラ","コーヒー","水"};
		for(String value:names) {
			System.out.print(value+"は");
			System.out.println(value.length()+"文字");
		}
//		
//		int[] points = {80,90,60,70};
//		int sum = 0;
//		for(int value:points) {
//			sum += value;
//		}
//		System.out.println("合計"+sum);
//		
//		int count = 0;
//		for(int value:points) {
//			if(value >=70) {
//				count++;
//			}
//		}
//		System.out.println("70点以上の科目は"+count+"つ");
	}

}
