
public class Gengo {

	public static void main(String[] args) {
		System.out.println("元号西暦変換");
		System.out.println("1:昭和　2:平成　3:令和");
		int gengou = new java.util.Scanner(System.in).nextInt();
		System.out.println("年を入力");
		int nen = new java.util.Scanner(System.in).nextInt();
		System.out.println(GengouName(gengou)+nen+"年は西暦"+getSeireki(gengou,nen)+"年");

	}

	public static int getSeireki(int gengou, int nen) {
		int seireki = 0;
		if(gengou == 1) {
			seireki = 1926+nen-1;
		}else if(gengou == 2) {
			seireki = 1989+nen-1;
		}else if(gengou == 3) {
			seireki = 2019+nen-1;
		}else {
			seireki = 0;
		}


		return seireki;
	}

	public static String GengouName(int gengou) {
		String name = null;
		if(gengou == 1) {
			name = "昭和";
		}else if(gengou == 2) {
			name = "平成";
		}else if(gengou == 3) {
			name = "令和";
		}else {
			name = "エラー";
		}
		return name;
	}

}
