/**
 * 
 */
package view;

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
import javax.swing.border.TitledBorder;

/**
 * @author lethanhtam
 *
 */
public class ToolBarPanel extends JPanel {
	public static final int line = 1;
	public static final int rastangle = 2;
	public static final int cricle = 3;
	public static final int paint = 4;
	private StatusPanel status;
	private DrawingPanel drawing;

	public ToolBarPanel(StatusPanel status, DrawingPanel drawing) {
		this.status=status;
		this.drawing=drawing;
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(1, 2));

		// action
		ActionListener acShape = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String src = e.getActionCommand();
				status.setStrShape(src);
				switch (src) {
				case "line":
					drawing.setShapeType(line);
					break;
				case "rastangle":
					drawing.setShapeType(rastangle);
					break;
				case "cricle":
					drawing.setShapeType(cricle);
					break;
				case "paint":
					drawing.setShapeType(paint);
					break;
				}
			}
		};
		ActionListener acColor = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String src = e.getActionCommand();
				status.setStrColor(src);
				switch (src) {
				case "WHITE":
					drawing.setColor(Color.WHITE);
					break;
				case "BLACK":
					drawing.setColor(Color.BLACK);
					break;
				case "pink":
					drawing.setColor(Color.pink);
					break;
				case "BLUE":
					drawing.setColor(Color.BLUE);
					break;
				case "RED":
					drawing.setColor(Color.RED);
					break;
				case "green":
					drawing.setColor(Color.green);
					break;
				}
			}
		};

		JPanel shapePanel = new JPanel();
		shapePanel.setBorder(new TitledBorder("shape"));
		shapePanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		shapeButton buttonShape;
		buttonShape = new shapeButton(line);
		buttonShape.addActionListener(acShape);
		buttonShape.setActionCommand("line");
		shapePanel.add(buttonShape);

		buttonShape = new shapeButton(rastangle);
		buttonShape.addActionListener(acShape);
		buttonShape.setActionCommand("rastangle");
		shapePanel.add(buttonShape);

		buttonShape = new shapeButton(cricle);
		buttonShape.addActionListener(acShape);
		buttonShape.setActionCommand("cricle");
		shapePanel.add(buttonShape);

		buttonShape = new shapeButton(paint);
		buttonShape.addActionListener(acShape);
		buttonShape.setActionCommand("paint");
		shapePanel.add(buttonShape);

		JPanel colorPanel = new JPanel();
		colorPanel.setBorder(new TitledBorder("color"));
		colorPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		colorButton buttonColor;

		buttonColor = new colorButton(Color.WHITE);
		buttonColor.addActionListener(acColor);
		buttonColor.setActionCommand("WHITE");
		colorPanel.add(buttonColor);

		buttonColor = new colorButton(Color.BLACK);
		buttonColor.addActionListener(acColor);
		buttonColor.setActionCommand("BLACK");
		colorPanel.add(buttonColor);

		buttonColor = new colorButton(Color.pink);
		buttonColor.addActionListener(acColor);
		buttonColor.setActionCommand("pink");
		colorPanel.add(buttonColor);

		buttonColor = new colorButton(Color.BLUE);
		buttonColor.addActionListener(acColor);
		buttonColor.setActionCommand("BLUE");
		colorPanel.add(buttonColor);

		buttonColor = new colorButton(Color.RED);
		buttonColor.addActionListener(acColor);
		buttonColor.setActionCommand("RED");
		colorPanel.add(buttonColor);

		buttonColor = new colorButton(Color.green);
		buttonColor.addActionListener(acColor);
		buttonColor.setActionCommand("green");
		colorPanel.add(buttonColor);

		this.add(shapePanel);
		this.add(colorPanel);
	}

	public class shapeButton extends JButton {
		int shapeTyne;

		public shapeButton(int shapeTyne) {
			this.shapeTyne = shapeTyne;
			this.setPreferredSize(new Dimension(50, 50));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			switch (shapeTyne) {
			case line:
				g.drawLine(5, 5, 45, 45);
				break;
			case rastangle:
				g.drawRect(5, 5, 40, 40);
				break;
			case cricle:
				g.drawOval(5, 5, 40, 40);
				break;
			case paint:
				this.setIcon(
						new ImageIcon(Toolkit.getDefaultToolkit().createImage(app.class.getResource("paintIcon.png"))));
				break;

			}

		}
	}

	public class colorButton extends JButton {
		Color color;

		public colorButton(Color color) {
			this.color = color;
			this.setBackground(color);
			this.setPreferredSize(new Dimension(30, 30));
		}

	}

}
