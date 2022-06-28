package app;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class ToolBar extends JPanel{
	public static final int LINE=1;
	public static final int SQUARE=2;
	public static final int RECT=3;
	public static final int CIRCLE=4;
	DrawingPane drawingPane;
	public ToolBar(DrawingPane drawingPane) {
		this.drawingPane = drawingPane;
		ActionListener sAction = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				ShapeButton button = (ShapeButton) e.getSource();
				int shapeType = button.shapeType;
				drawingPane.setShapeType(shapeType);
			}
		};
		ActionListener cAction = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				ColorButton button = (ColorButton) e.getSource();
				Color color = button.color;
				drawingPane.setColor(color);
			}
		};
		Border border = BorderFactory.createEtchedBorder();
		JPanel shapePane = new JPanel();
		shapePane.setBorder(BorderFactory.createTitledBorder(border, "Chọn Hình"));
		ShapeButton sb;
		sb = new ShapeButton(LINE);
		sb.addActionListener(sAction);
		shapePane.add(sb);
		sb = new ShapeButton(SQUARE);
		sb.addActionListener(sAction);
		shapePane.add(sb);
		sb = new ShapeButton(RECT);
		sb.addActionListener(sAction);
		shapePane.add(sb);
		sb = new ShapeButton(CIRCLE);
		sb.addActionListener(sAction);
		shapePane.add(sb);
		
		setLayout(new FlowLayout( FlowLayout.LEFT));
		add(shapePane);
		
		JPanel colorPane = new JPanel();
		colorPane.setBorder(BorderFactory.createTitledBorder(border, "Chọn Màu"));
		ColorButton cb;
		cb = new ColorButton(Color.BLACK);
		cb.addActionListener(cAction);
		colorPane.add(cb);
		cb = new ColorButton(Color.BLUE);
		cb.addActionListener(cAction);
		colorPane.add(cb);
		cb = new ColorButton(Color.GREEN);
		cb.addActionListener(cAction);
		colorPane.add(cb);
		cb = new ColorButton(Color.YELLOW);
		cb.addActionListener(cAction);
		colorPane.add(cb);
		cb = new ColorButton(Color.CYAN);
		cb.addActionListener(cAction);
		colorPane.add(cb);
		cb = new ColorButton(Color.RED);
		cb.addActionListener(cAction);
		colorPane.add(cb);
		
		add(colorPane);
	}
	
	class ColorButton extends JButton{
		Color color;
		public ColorButton(Color color) {
			this.color = color;
			setPreferredSize(new Dimension(50, 50));
		}
		@Override
		public void paintComponent(Graphics g) {
			setBackground(color);	
			super.paintComponent(g);
		}
	}
	
	class ShapeButton extends JButton{
		int shapeType;
		public ShapeButton(int shapeType) {
			this.shapeType = shapeType;
			setPreferredSize(new Dimension(50, 50));
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			switch(shapeType) {
			case LINE : g.drawLine(0, 0, 50, 50);
				break;
			case SQUARE: g.drawRect(5, 5, 40, 40);
				break;
			case RECT: g.drawRect(5, 15, 40, 20);
				break;
			case CIRCLE: g.drawOval(5, 5, 40, 40);
				break;
			}		
		}
	}

}
