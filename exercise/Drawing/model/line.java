package model;

import java.awt.Color;
import java.awt.Graphics;

public class line extends ShapeAbstract {

	private int x;
	private int y;

	public line(int x1, int y1, Color color) {
		super(x1, y1, color);
		// TODO Auto-generated constructor stub
		this.x = x1;
		this.y = y1;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawLine(x1, y1, x, y);
	}

	@Override
	public void resize(int x2, int y2) {
		// TODO Auto-generated method stub
		this.x = x2;
		this.y = y2;
	}

}
