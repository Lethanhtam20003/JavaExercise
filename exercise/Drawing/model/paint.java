package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class paint extends ShapeAbstract {
	private Point first;
	private Point last;
	private ArrayList<Point> lines = new ArrayList<>();

	public paint(int x1, int y1, Color color) {
		super(x1, y1, color);
		// TODO Auto-generated constructor stub
		first = new Point(x1, y1);
		last = new Point(x1, y1);
		lines.add(last);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawLine((int) first.getX(), (int) first.getY(), (int) last.getX(), (int) last.getY());
		Point firstPoint = lines.get(0);
		Point lastPoint ;
		for (int i = 1; i < lines.size(); i++) {
			lastPoint = lines.get(i);
			g.drawLine((int) firstPoint.getX(), (int) firstPoint.getY(), (int) lastPoint.getX(), (int) lastPoint.getY());
			firstPoint=lastPoint;
		}
	}

	@Override
	public void resize(int x2, int y2) {
		// TODO Auto-generated method stub
		lines.add(first);
		lines.add(last);
		this.first = this.last;
		this.last = new Point(x2, y2);

	}

}
