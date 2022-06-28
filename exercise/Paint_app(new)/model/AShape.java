package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class AShape {
	protected int x;
	protected int y;
	protected Color color;
	public AShape(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public abstract void paint(Graphics g);
	
	public abstract void reSize(int x,int y);
	
}
