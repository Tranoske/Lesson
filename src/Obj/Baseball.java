package Obj;

public class Baseball implements Sports {
	String name = "スポーツ";

	@Override
	public void shiai() {
		System.out.println("プレイボール");

	}

	@Override
	public void end() {
		System.out.println("ゲームセット");

	}

}
