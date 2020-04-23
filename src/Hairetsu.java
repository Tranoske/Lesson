
public class Hairetsu {

	public static void main(String[] args) {
//		int[] scores;
//		scores = new int[5];
//		
//		scores[0] = 20;
//		System.out.println(scores.length);
//		System.out.println(scores[0]);
//	
//		int[] prices = {100,200,150};
//
//		System.out.println(prices.length);
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(prices[i]);
//		}
//		
//		String[] names = {"コーラ","コーヒー","水"};
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(names[i]);
//		}
//		
//		int[] points = {80,90,60,70};
//		int sum = 0;
//		for(int i=0;i<points.length;i++) {
//			sum += points[i];
//			System.out.println(points[i]);
//		}
//		System.out.println("合計"+sum);
//		int count = 0;
//		for(int i=0;i<points.length;i++) {
//			if(points[i] >=70) {
//				count++;
//			}
//		}
//		System.out.println("70点以上の科目は"+count+"つ");
		
		int[] seq = {0,1,0,2,3,0};
		for(int i=0; i<seq.length;i++){
			char[] base ={'A','T','G','C'};
			System.out.println(base[seq[i]]);
		}
	}

}
