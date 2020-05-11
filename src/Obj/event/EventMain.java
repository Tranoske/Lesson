package Obj.event;

public class EventMain {

	public static void main(String[] args) {
		Event e = new Event("春の人狼大会");
		try {
			e.add(new Sankasha("田中",11));
			e.add(new Sankasha("山田",25));
			e.add(new Sankasha("山本",35));
		}catch (SankashaException er) {
			System.out.println("err:"+er.getMessage());
		}
		e.show();
		
	}
}
