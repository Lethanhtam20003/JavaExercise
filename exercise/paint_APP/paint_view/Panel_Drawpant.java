/**
 * 
 */
package paint_view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import paint_model.ashape;
import paint_model.Spuare;
import paint_model.cricle;
import paint_model.line;

/**
 * @author lethanhtam
 *
 */
public class Panel_Drawpant extends JPanel {
	List<ashape> shape = new ArrayList<ashape>();
	ashape last;
	boolean isStarted;

	int shapeType;
	Color color;
	
	public Panel_Drawpant() {
		// TODO Auto-generated constructor stub
		MouseAdapter ad = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((shapeType == 0) || (color == null))
					return;

				if (e.getButton() == MouseEvent.BUTTON1) {
					if (isStarted) {
						shape.add(last);
						last = null;
						isStarted = false;
					} else {
						isStarted = true;
						switch (shapeType) {
						case 1:
							last = new line(e.getX(), e.getY(), color);
							break;
						case 2:
						//	last = new Spuare()
							break;
						case 3:
							break;
						case 4:
							last= new cricle(e.getX(), e.getY(),(int)Math.sqrt(e.getX()*e.getX()+e.getY()*e.getY()) ,color);
							break;
						}
					}
				} else {

				}
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if (!isStarted)
					return;
				last.resize(e.getX(), e.getY());
				repaint();
			}
		};
		addMouseListener(ad);
		addMouseMotionListener(ad);
	}

	@Override
	public void paintComponent(Graphics g) {
		this.setBackground(color.WHITE);
		super.paintComponent(g);
		if (last != null)
			last.paint(g);
		for (ashape shape : shape) {
			shape.paint(g);
		}
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the shapeType
	 */
	public int getShapeType() {
		return shapeType;
	}

	/**
	 * @param shapeType the shapeType to set
	 */
	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}
}
