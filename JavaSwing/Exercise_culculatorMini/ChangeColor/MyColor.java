package ChangeColor;

import java.awt.Color;

public class MyColor {
	private Color fbreground;
	private Color background;
	private boolean opaque;
	public MyColor() {
		this.fbreground = Color.BLACK;
		this.background = Color.WHITE;
		this.opaque = true;
		
	}
	public Color getFbreground() {
		return fbreground;
	}
	public void setFbreground(Color fbreground) {
		this.fbreground = fbreground;
	}
	public Color getBackground() {
		return background;
	}
	public void setBackground(Color background) {
		this.background = background;
	}
	public boolean isOpaque() {
		return opaque;
	}
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
	
}
