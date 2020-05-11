package team;

public class TeamMain {

	public static void main(String[] args) {
		Team t = new Team("ヨワッソ熊本", 0, 100);
		System.out.println(t.getName()+"  "+t.getWin()+"勝"+t.getLose()+"敗");
		
		Team t2 = new Team();
		t2.setName("ロアッソ熊本");
		t2.setWin(5);
		t2.setLose(2);
		System.out.println(t2.getName()+"  "+t2.getWin()+"勝"+t2.getLose()+"敗");
	}

}
