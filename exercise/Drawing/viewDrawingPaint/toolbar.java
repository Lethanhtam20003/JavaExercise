package viewDrawingPaint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class toolbar extends JPanel {
	public static final int dot = 1;
	public static final int line = 2;
	public static final int rectangle = 3;
	public static final int circle = 4;
	public static final int paint = 5;

	private Status status;
	private Drawing drawing;
 
	public toolbar(Status status, Drawing drawing) {
		this.status = status;
		this.drawing = drawing;
		// TODO Auto-generated constructor stub
		//this.setBorder(new SplitPaneBorder(Color.BLACK, Color.white));
		this.setLayout(new GridLayout(1, 2));
		JPanel pnShpae = new JPanel();
		pnShpae.setLayout(new FlowLayout(FlowLayout.LEFT));
		buttonShape btShpae;

		btShpae = new buttonShape(dot);
		btShpae.setActionCommand("dot");
		btShpae.addActionListener(acListionShape);
		pnShpae.add(btShpae);

		btShpae = new buttonShape(line);
		btShpae.setActionCommand("line");
		btShpae.addActionListener(acListionShape);
		pnShpae.add(btShpae);

		btShpae = new buttonShape(rectangle);
		btShpae.setActionCommand("rectangle");
		btShpae.addActionListener(acListionShape);
		pnShpae.add(btShpae);

		btShpae = new buttonShape(circle);
		btShpae.setActionCommand("circle");
		btShpae.addActionListener(acListionShape);
		pnShpae.add(btShpae);

		btShpae = new buttonShape(paint);
		btShpae.setActionCommand("paint");
		btShpae.addActionListener(acListionShape);
		pnShpae.add(btShpae);

		JPanel pncolor = new JPanel();
		pncolor.setLayout(new FlowLayout());
		buttonColor btColor;

		btColor = new buttonColor(Color.BLACK);
		btColor.setActionCommand("BLACK");
		btColor.addActionListener(acListionColor);
		pncolor.add(btColor);

		btColor = new buttonColor(Color.white);
		btColor.setActionCommand("white");
		btColor.addActionListener(acListionColor);
		pncolor.add(btColor);

		btColor = new buttonColor(Color.pink);
		btColor.setActionCommand("pink");
		btColor.addActionListener(acListionColor);
		pncolor.add(btColor);

		btColor = new buttonColor(Color.red);
		btColor.setActionCommand("red");
		btColor.addActionListener(acListionColor);
		pncolor.add(btColor);

		btColor = new buttonColor(Color.blue);
		btColor.setActionCommand("blue");
		btColor.addActionListener(acListionColor);
		pncolor.add(btColor);

		btColor = new buttonColor(Color.green);
		btColor.setActionCommand("green");
		btColor.addActionListener(acListionColor);
		pncolor.add(btColor);

		this.add(pnShpae);
		this.add(pncolor);

	}

	public class buttonShape extends JButton {
		private int shapeType;

		public buttonShape(int shapeType) {
			this.shapeType = shapeType;
			this.setPreferredSize(new Dimension(50, 50));
			this.setBackground(Color.white);
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			switch (shapeType) {
			case dot:
				g.fillRect(23, 23, 5, 5);
				break;
			case line:
				g.drawLine(5, 5, 45, 45);
				break;
			case rectangle:
				g.drawRect(5, 5, 40, 40);
				break;
			case circle:
				g.drawOval(5, 5, 40, 40);
				break;
			case paint:
				this.setIcon(
						new ImageIcon(Toolkit.getDefaultToolkit().createImage(app.class.getResource("paintIcon.png"))));
				break;
			default:
				break;
			}
		}

	}

	public class buttonColor extends JButton {
		private Color color;

		public buttonColor(Color color) {
			// TODO Auto-generated constructor stub
			this.color = color;
			this.setPreferredSize(new Dimension(50, 50));
			this.setBackground(color);

		}
	}

	ActionListener acListionShape = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buttonShape shape = (buttonShape) e.getSource();
			int shapeType = shape.shapeType;
			drawing.setShapeType(shapeType);
			
			String str = e.getActionCommand();
			switch (str) {
			case "dot":
				status.setStrShape("Shape: " + str);
				break;
			case "line":
				status.setStrShape("Shape: " + str);
				break;
			case "rectangle":
				status.setStrShape("Shape: " + str);
				break;
			case "circle":
				status.setStrShape("Shape: " + str);
				break;
			case "paint":
				status.setStrShape("Shape: " + str);
				break;
			}
		}
	};
	ActionListener acListionColor = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buttonColor color = (buttonColor)e.getSource();
			Color bt = color.color;
			drawing.setColor(bt);
			
			String str = e.getActionCommand();
			switch (str) {
			case "BLACK":
				status.setStrColor("color: " + str);
				break;
			case "white":
				status.setStrColor("color: " + str);
				break;
			case "pink":
				status.setStrColor("color: " + str);
				break;
			case "red":
				status.setStrColor("color: " + str);
				break;
			case "blue":
				status.setStrColor("color: " + str);
				break;
			case "green":
				status.setStrColor("color: " + str);
				break;

			}

		}
	};
}
