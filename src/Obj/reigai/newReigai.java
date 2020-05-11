package Obj.reigai;

import java.io.FileWriter;
import java.io.IOException;

public class newReigai {

	public static void main(String[] args) {
//		try(FileWriter fw = new FileWriter("data.txt");){
//			fw.write("hello!");
//		}catch (IOException e) {
//			System.out.println("エラー："+e.getMessage());
//		}
		sub();
	}
	
	public static void sub() {
		try {
			subsub();
		} catch (Exception e) {
			System.err.println("err");
		}
	}
	
	public static void subsub() throws IOException{
		FileWriter fw = new FileWriter("data.txt");
		fw.close();
	}
}
