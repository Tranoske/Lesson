package team;

public class Team {
	private String name;
	private int win;
	private int lose;
	
	public Team(String name, int win, int lose) {
		this.name = name;
		this.win = win;
		this.lose = lose;
	}
	public Team() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	
	
}
