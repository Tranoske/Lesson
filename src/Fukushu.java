
public class Fukushu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
			for(int value:tensus) {
				System.out.println(value);
			}
			int sum =0;
			for(int value:tensus){
				sum += value;
			}
			System.out.println(sum);
			
			int count =0;
			for(int value:tensus) {
				if (value >= 70) {
					count ++;
				}
			}
			System.out.println(count);
			
	}

}
