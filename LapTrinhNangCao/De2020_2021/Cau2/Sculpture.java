package Cau2;

public class Sculpture extends ArtObject {
	private String meterialFrom;
	private int hight;
	private int wight;
	public Sculpture(String arttist, int publicYear, String title, String meterialFrom, int hight, int wight) {
		super(arttist, publicYear, title);
		this.meterialFrom = meterialFrom;
		this.hight = hight;
		this.wight = wight;
	}
	
}
