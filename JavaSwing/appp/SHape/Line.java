package SHape;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends AShape {
	int x2, y2;

	public Line(int x, int y, Color color) {
		super(x, y, color);
		x2 = x;
		y2 = y;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.drawLine(x, y, x2, y2);
	}

	@Override
	public void resize(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

}
