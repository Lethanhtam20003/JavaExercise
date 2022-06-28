package model;

import java.awt.Color;
import java.awt.Graphics;

public class cricle extends AShape {
	int radium;
	
	public cricle(int x, int y, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
		this.radium=0;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawOval(x-radium, y-radium, 2*radium, 2*radium);
		
	}

	@Override
	public void reSize(int x2, int y2) {
		// TODO Auto-generated method stub
		int dx=x2-x;
		int dy=y2-y;
		this.radium=(int)Math.sqrt(dy*dy+dx*dx);
	}

}
