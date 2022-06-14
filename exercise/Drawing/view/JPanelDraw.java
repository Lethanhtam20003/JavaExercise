package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel {
	Graphics g;
	Point point=new Point(0,0);
	public JPanelDraw() {
		// TODO Auto-generated constructor stub
		new JPanel();
	}
	public void paintOval(Point point2) {
		System.out.println("ve hinh");
		this.point = point2;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(point.x,point.y, 10,10);
		System.out.println(point);
		
	}

	public void drawline(int x1,int y1,int x2,int y2) {
		g.drawLine(x1, y1, x2, y2);
		
	}
}
