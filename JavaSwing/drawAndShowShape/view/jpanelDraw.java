package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class jpanelDraw extends JPanel {
	public jpanelDraw() {
		this.setBackground(Color.white);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.pink);
		g.drawLine(25, 15, 50, 150);
		
//		g.drawRect(30, 30, 35, 40);
//		
//		g.drawOval(70,70,50,50);
//		
//		g.drawString("heheeh", 100, 100);
//		
//		g.fillRect(140, 140, 40, 40);
//		
//		g.fillOval(200, 200, 50, 50);
//		
	}
	

}
