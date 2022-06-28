package SHape;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends AShape {
	int x2,y2;
	public Rectangle(int x, int y, Color color) {
		super(x, y, color);
		x2 = x;
		y2 = y;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
	    g.drawRect(Math.min(x,x2),Math.min(y,y2), Math.abs(x - x2),Math.abs(y - y2));
	  
	}

	@Override
	public void resize(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;	
	}

}

