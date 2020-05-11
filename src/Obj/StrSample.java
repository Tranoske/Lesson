package Obj;

public class StrSample {

	public static void main(String[] args) {
		String s1 = "This is Javanese";
		String s2 = "java";
		String s3 = "";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("おなーじ");
		}else {
			System.out.println("違う。");
		}
		if (s3.isEmpty()) {
			System.out.println("空文字でした");
		}
		if(s1.contains("Java")) {
			System.out.println("含まれちょんね。");
		}
		if(s1.endsWith("ese")) {
			System.out.println("eseで終わるわ。");
		}
		if(s1.startsWith("This")) {
			System.out.println("Thisではじまるこのせかい。");
		}
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.lastIndexOf("s"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0,4));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace("Javanese", "C++"));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("abc");
		sb.append("def");
		sb.append("ghi");
		
		String s = sb.toString();
		System.out.println(s);
		
		
	}

}
