package model;

import java.awt.Color;
import java.awt.Graphics;

public class restangle extends ShapeAbstract {
	int x, y, wight, hight;

	public restangle(int x1, int y1, Color color) {
		super(x1, y1, color);
		// TODO Auto-generated constructor stub
		this.x = x1;
		this.y = y1;
		this.wight = x1;
		this.hight = y1;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawRect(Math.min(x, x1), Math.min(y, y1), Math.abs(x - x1), Math.abs(y - y1));
	}

	@Override
	public void resize(int x2, int y2) {
		// TODO Auto-generated method stub
		this.x = x2;
		this.y = y2;

	}

}
