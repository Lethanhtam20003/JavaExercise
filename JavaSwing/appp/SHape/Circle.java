package SHape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends AShape {
	int radius;
	public Circle(int x, int y, Color color) {
		super(x, y, color);
		radius = 0;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}

	@Override
	public void resize(int x2, int y2) {
		int dx = x2-x;
		int dy = y2-y;
		this.radius = (int) Math.sqrt(dx*dx + dy*dy);
		
	}

}
