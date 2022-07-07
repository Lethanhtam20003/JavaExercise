package model;

import java.awt.Color;
import java.awt.Graphics;

public class line extends AShape{
	private int x2,y2;
	public line(int x, int y, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
		this.x2=x;
		this.y2=y;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawLine(x, y, x2, y2);
		
	}

	@Override
	public void reSize(int x2, int y2) {
		// TODO Auto-generated method stub
		this.x2=x2;
		this.y2=y2;
		
	}
	
}
