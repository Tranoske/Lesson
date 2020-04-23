
public class Hairetsu3 {

	public static void main(String[] args) {
		//int numsに8,5,9,2,4
		int[] nums= {8,5,9,2,4};
		//全表示
		System.out.print("numsの中身は：");
		for(int value:nums) {
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println();
		//sum
		int sum = 0;
		for(int value:nums) {
			sum += value;
		}
		System.out.println("合計："+sum);
		//5以上の個数
		int count = 0;
		for(int value:nums) {
			if(value >= 5) {
				count++;
			}
		}
		System.out.println("5以上は"+count+"個");
		//すべての要素を２倍に
		for(int i=0;i<nums.length;i++) {
			nums[i] = nums[i]*2;
		}
		//最大値を求める
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(max);

	}

}
