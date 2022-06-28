package paint_model;

import java.awt.Color;
import java.awt.Graphics;

public class cricle extends ashape {
	int radium;

	public cricle(int x, int y, int radium, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
		this.radium = radium;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawOval(x - radium, y - radium, 2 * radium, 2 * radium);
	}

	@Override
	public void resize(int x2, int y2) {
		// TODO Auto-generated method stub
		int dx = x2 - x;
		int dy = y2 - y;
		radium =(int) Math.sqrt(dx*dx+dy*dy);
	}

}
