package Cau2;

public class Painting extends ArtObject {
	private String paintType;
	private String style;
	public Painting(String arttist, int publicYear, String title, String paintType, String style) {
		super(arttist, publicYear, title);
		this.paintType = paintType;
		this.style = style;
	}
	
}
