package Obj.reigai;

import java.io.FileWriter;
import java.io.IOException;

public class Reigai {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch (IOException e) {
			System.out.println("エラーやん。ほら↓");
			System.out.println(e.getMessage());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage()+"やね");
		}finally {
			if(fw !=null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("後片付けも許されないのか");
					e.printStackTrace();
				}
				System.out.println("後片付け");
			}
		}
	}

}