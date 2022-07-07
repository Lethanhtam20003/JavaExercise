package model;

import java.awt.Color;
import java.awt.Graphics;

public class circle extends ShapeAbstract {
	int x,y,radium;
	public circle(int x1, int y1, Color color) {
		super(x1, y1, color);
		// TODO Auto-generated constructor stub
		this.x=x1;
		this.y=y1;
		this.radium=0;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawOval(x-radium, y-radium, radium*2, radium*2);
	}

	@Override
	public void resize(int x2, int y2) {
		// TODO Auto-generated method stub
		int dx,dy;
		dx=x-x2;
		dy=y-y2;
		this.radium=(int) Math.sqrt(dx*dx+dy*dy);
	}

}
