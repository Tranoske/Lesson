
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
		
		if (isGuusu(2)) {
			System.out.println("偶数やね");
		}else {
			System.out.println("奇数やね");
		}
		
		System.out.println(getTimeName(2));
		
		int[] nums = {5,8,9,2};
		printArray(nums);
		
		String data = "apple,orange,suica,lemon";
		String[] fruits = data.split(",");
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		
		int[] tesuto = {1,2,3,4,5};
		
		System.out.println(getLast(tesuto));
	}
	
	public static int getLast(int[] array) {
		int last = array[array.length-1];
		return last;
	}
	
	public static void printArray(int[] array) {
		for(int num:array) {
			System.out.println(num);
		}
	}
	
	public static String getTimeName(int hour) {
		if (hour <= 11 && hour >= 0) {
			return "午前";
		}
		if (hour >= 12 && hour <= 24){
			return "午後";
		}
			return "エラー";
	}
	
	public static boolean isGuusu(int num) {
		//return (num % 2==0);
		if(num % 2 ==0) {
			return true;
		}else {
			return false;
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
