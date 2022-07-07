package model;

import java.awt.Color;
import java.awt.Graphics;

public class dot extends ShapeAbstract {
	private int x,y;
	public dot(int x1, int y1, Color color) {
		super(x1, y1, color);
		// TODO Auto-generated constructor stub
		this.x=x1;
		this.y=y1;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillOval(x , y, 5, 5);
		resize(x, y);
	}

	@Override
	public void resize(int x2, int y2) {
		// TODO Auto-generated method stub
		this.x=x2;
		this.y=y2;
	}

}
