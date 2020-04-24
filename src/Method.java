
public class Method {

	public static void main(String[] args) {
		System.out.println("いでよ、yelloメソド！！！");
		yello("さわやに");
		int kotae = keisan(4,5);
		System.out.println(kotae);
		yello("楽しく");
		int gk = goukei(2);
		System.out.println(gk);
		yello("本気で");
		show("拳で抵抗する",21);
		
		int x = 10;
		test(x);
		System.out.println(x);
		
		for (int i=10;i<=20;i++) {
			jijo(i);
		}
		
		String[] names = {"山本","佐藤","鈴木"};
		for (String value:names) {
			yello(value);
		}
		
		
	}
	public static void test (int x) {
		x = 20;
	}
	
	public static void jijo(int num) {
		int jijo = num*num;
		System.out.println(jijo);
	}
	
	public static void yello(String name) {
		System.out.println("おはよう、"+name+"！( ᐛ👐)ﾊﾟｧ");
	}
	
	public static int keisan(int num1,int num2) {
		return num1+num2;
		
	}
	public static int goukei(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		return sum;
	}
	public static void show(String name, int age) {
		
		System.out.println("🤜🤛もちろん"+name+age+"歳🤜🤛");
	}
	
	
}
