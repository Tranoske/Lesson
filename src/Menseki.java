
public class Menseki {

	public static void main(String[] args) {
		System.out.print("10のとき：");
		System.out.println(menseki(10));
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			System.out.print(i+"のとき：");
			System.out.println(menseki(i));
		}
		System.out.println();
		
		
		int[] retsuhanke = {3,8,20};
		for (int value:retsuhanke) {
			System.out.print(value+"のとき：");
			System.out.println(menseki(value));
		}
	}
	
	public static double menseki(int hankei) {
		double menseki= hankei*hankei*3.14;
		return menseki;
	}

}
