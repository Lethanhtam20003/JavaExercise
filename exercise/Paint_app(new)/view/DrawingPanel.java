package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import model.AShape;
import model.cricle;
import model.line;
import model.restangle;

public class DrawingPanel extends JPanel {
	List<AShape> shapes = new ArrayList<AShape>();
	AShape lastShape;

	int shapeType;
	Color color;
	boolean isStarted;

	public DrawingPanel() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.white);
		setFocusable(true);
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		// this.setColor(Color.black);
		this.setShapeType(ToolBarPanel.line);

		// mouse
		MouseAdapter adapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					if (isStarted) {
						shapes.add(lastShape);
						lastShape = null;
						isStarted = false;
					} else {
						switch (shapeType) {
						case ToolBarPanel.line:
							lastShape = new line(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case ToolBarPanel.rastangle:
							lastShape = new restangle(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case ToolBarPanel.cricle:
							lastShape = new cricle(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						}

					}

				} else {
					
					isStarted = false;
					lastShape = null;
					repaint();

				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if (!isStarted)
					return;
				lastShape.reSize(e.getX(), e.getY());
				repaint();
			}
		};
		this.addMouseListener(adapter);
		this.addMouseMotionListener(adapter);
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keycode = e.getKeyCode();
				if (e.isControlDown()) {
					switch (keycode) {
					case KeyEvent.VK_L:
						setShapeType(ToolBarPanel.line);
						break;
					case KeyEvent.VK_C:
						setShapeType(ToolBarPanel.cricle);
						break;
					case KeyEvent.VK_R:
						setShapeType(ToolBarPanel.rastangle);
						break;
					}
					return;
				}
				if (e.isAltDown()) {
					switch (keycode) {
					case KeyEvent.VK_R:
						setColor(Color.red);
						break;
					case KeyEvent.VK_G:
						setColor(Color.green);
						break;
					case KeyEvent.VK_B:
						setColor(Color.blue);
						break;
					}
				}
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(color.white);
		for (AShape shape : shapes)
			shape.paint(g);

		if (lastShape != null)
			lastShape.paint(g);
	}

	/**
	 * @param shapeType the shapeType to set
	 */
	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
