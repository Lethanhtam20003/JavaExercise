package paint_view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class panel_toolbar extends JPanel {
	public static final int line = 1;
	public static final int square = 2;
	public static final int res = 3;
	public static final int cricle = 4;
	private panel_showText showText;
	private Panel_Drawpant Drawpant;

	public panel_toolbar(panel_showText showText, Panel_Drawpant Drawpant) {
		this.showText = showText;
		this.Drawpant = Drawpant;
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(1, 2));
		Border border = BorderFactory.createEtchedBorder();

		//
		ActionListener actionShape = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape_button buttonS = (shape_button) e.getSource();
				int sapetype = buttonS.shapeTyne;
				Drawpant.setShapeType(sapetype);
				switch (sapetype) {
				case 1:
					showText.setStr("line");
					break;
				case 2:
					showText.setStr("square");
					break;
				case 3:
					showText.setStr("restangle");
					break;
				case 4:
					showText.setStr("cricle");
					break;
				}

			}
		};
		ActionListener acColor = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String color = e.getActionCommand();
				switch (color) {
				case "white":
					Drawpant.setColor(Color.white);
					showText.setColor(Color.white);
					break;
				case "RED":
					Drawpant.setColor(Color.RED);
					showText.setColor(Color.RED);
					break;
				case "green":
					Drawpant.setColor(Color.green);
					showText.setColor(Color.green);
					break;
				case "PINK":
					Drawpant.setColor(Color.PINK);
					showText.setColor(Color.PINK);
					break;
				case "CYAN":
					Drawpant.setColor(Color.CYAN);
					showText.setColor(Color.CYAN);
					break;
				case "black":
					Drawpant.setColor(Color.black);
					showText.setColor(Color.black);
					break;
				}

			}
		};

		// panel Shape
		JPanel panel_shape = new JPanel();
		panel_shape.setBorder(BorderFactory.createTitledBorder(border, "option shape"));
		panel_shape.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(panel_shape);

		shape_button buttonShape;
		buttonShape = new shape_button(1);
		buttonShape.addActionListener(actionShape);
		panel_shape.add(buttonShape);

		buttonShape = new shape_button(2);
		buttonShape.addActionListener(actionShape);
		panel_shape.add(buttonShape);

		buttonShape = new shape_button(3);
		buttonShape.addActionListener(actionShape);
		panel_shape.add(buttonShape);

		buttonShape = new shape_button(4);
		buttonShape.addActionListener(actionShape);
		panel_shape.add(buttonShape);

		// panel color
		JPanel panel_color = new JPanel();
		panel_color.setBorder(BorderFactory.createTitledBorder(border, "option color"));
		panel_color.setLayout(new FlowLayout());
		this.add(panel_color);

		color_button cb;
		cb = new color_button(Color.white);
		cb.addActionListener(acColor);
		cb.setActionCommand("white");
		panel_color.add(cb);

		cb = new color_button(Color.RED);
		cb.setActionCommand("RED");
		cb.addActionListener(acColor);
		panel_color.add(cb);

		cb = new color_button(Color.green);
		cb.setActionCommand("green");
		cb.addActionListener(acColor);
		panel_color.add(cb);

		cb = new color_button(Color.PINK);
		cb.setActionCommand("PINK");
		cb.addActionListener(acColor);
		panel_color.add(cb);

		cb = new color_button(Color.CYAN);
		cb.setActionCommand("CYAN");
		cb.addActionListener(acColor);
		panel_color.add(cb);

		cb = new color_button(Color.black);
		cb.setActionCommand("black");
		cb.addActionListener(acColor);
		panel_color.add(cb);
	}

	class shape_button extends JButton {
		int shapeTyne;

		public shape_button(int shapeType) {
			this.shapeTyne = shapeType;
			setPreferredSize(new Dimension(50, 50));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			switch (shapeTyne) {
			case 1:
				g.drawLine(0, 0, 50, 50);
				break;
			case 2:
				g.drawRect(5, 5, 40, 40);
				break;
			case 3:
				g.drawRect(10, 10, 30, 25);
				break;
			case 4:
				g.drawOval(5, 5, 40, 40);
				break;
			}
		}
	}

	class color_button extends JButton {
		Color color;

		public color_button(Color color) {
			// TODO Auto-generated constructor stub
			this.color = color;
			setBackground(color);
			setPreferredSize(new Dimension(50, 50));
		}

	}

}
