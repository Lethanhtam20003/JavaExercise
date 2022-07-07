package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class ShapeAbstract {
	protected int x1,y1;
	protected Color color;
	public ShapeAbstract(int x1, int y1, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.color = color;
	}
	public abstract void paint(Graphics g);
	
	public abstract void resize(int x2,int y2);
		
	
}
 