package Obj;

public class SeitoMain {

	public static void main(String[] args) {
		Chugakusei tnk = new Chugakusei("田中",80,70,50,9);
		tnk.show();
		System.out.println("合計:"+tnk.goukei()+"点");
		System.out.println("平均:"+tnk.heikin()+"点");
		System.out.println();
		Chugakusei ymd = new Chugakusei("山田",20,70,40,90);
		ymd.show();
		System.out.println("合計:"+ymd.goukei()+"点");
		System.out.println("平均:"+ymd.heikin()+"点");
		System.out.println();
		Chugakusei mri = new Chugakusei("毛利",0,0,0,200);
		mri.show();
		System.out.println("合計:"+mri.goukei()+"点");
		System.out.println("平均:"+mri.heikin()+"点");
		
		System.out.println();
		System.out.println("全員の合計:"+(tnk.goukei()+ymd.goukei()+mri.goukei())+"点");
	}
}
