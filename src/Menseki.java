
public class Menseki {

	public static void main(String[] args) {
		menseki(10);
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			menseki(i);
		}
		
		System.out.println();
		
		int[] retsuhanke = {3,8,20};
		for (int value:retsuhanke) {
			menseki(value);
		}

	}
	
	public static void menseki(int hankei) {
		
		double menseki= hankei*hankei*3.14;
		System.out.print("半径が"+hankei+"のときの面積：");
		System.out.println(menseki);
	}

}
