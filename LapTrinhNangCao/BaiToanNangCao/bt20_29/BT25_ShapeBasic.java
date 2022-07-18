package bt20_29;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class BT25_ShapeBasic {
	protected int x1, y1;
	protected Color color;

	public BT25_ShapeBasic(int x1, int y1, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.color = color;
	}

	public abstract void paint(Graphics g);

	/**
	 * 
	 * @author lethanhtam
	 *
	 */
	public class line extends BT25_ShapeBasic {
		private int x2, y2;

		public line(int x1, int y1, Color color, int x2, int y2) {
			super(x1, y1, color);
			this.x2 = x2;
			this.y2 = y2;
		}

		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.drawLine(x1, y1, x2, y2);
		}
	}

	/**
	 * 
	 * @author lethanhtam
	 *
	 */
	public class restangle extends BT25_ShapeBasic {
		private int wight, hight;

		public restangle(int x1, int y1, Color color, int wight, int hight) {
			super(x1, y1, color);
			this.wight = wight;
			this.hight = hight;
		}

		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.drawRect(x1, y1, wight, hight);
		}
	}

	/**
	 * 
	 * @author lethanhtam
	 *
	 */
	public class oval extends BT25_ShapeBasic {
		private int radium;

		public oval(int x1, int y1, Color color, int radium) {
			super(x1, y1, color);
			this.radium = radium;
		}

		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.drawOval(x1 - radium, y1 - radium, 2 * radium, 2 * radium);

		}
	}
	

}
