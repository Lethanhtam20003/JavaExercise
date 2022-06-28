package paint_model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class ashape {
	int x,y;
	Color color;
	public ashape(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public abstract void paint(Graphics g);
	public abstract void resize(int x2,int y2);
	
}
