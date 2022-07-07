package viewDrawingPaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.TitledBorder;

import model.ShapeAbstract;
import model.circle;
import model.dot;
import model.line;
import model.restangle;

public class Drawing extends JPanel {
	private List<ShapeAbstract> shapes = new ArrayList<ShapeAbstract>();
	private ShapeAbstract lastShape;
	private Color color;
	private int shapeType;

	private boolean isStarted;
	private JPopupMenu popupMenu;

	public Drawing() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.white);
		this.setBorder(new TitledBorder(" "));
		popupMenu = createPopupMenu();

		this.shapeType = toolbar.dot;
		this.color = Color.black;

		MouseAdapter a = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON1) {
					if (isStarted) {
						shapes.add(lastShape);
						lastShape = null;
						repaint();
						isStarted = false;
					} else {
						switch (shapeType) {
						case toolbar.dot:
							lastShape = new dot(e.getX(), e.getY(), color);
							// isStarted = true;
							repaint();
							shapes.add(lastShape);
							lastShape = null;
							isStarted = false;
							break;
						case toolbar.line:
							lastShape = new line(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case toolbar.rectangle:
							lastShape = new restangle(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case toolbar.circle:
							lastShape = new circle(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case toolbar.paint:
							lastShape = new paint(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						}
					}
				} else {
					lastShape = null;
					isStarted = false;

				}
				if (e.getButton() == MouseEvent.BUTTON3) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}

			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if (!isStarted)
					return;
				lastShape.resize(e.getX(), e.getY());
				repaint();
			}
		};

		this.addMouseListener(a);
		this.addMouseMotionListener(a);
		// this.addMouseListener(app.adapterPupupMenu);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (ShapeAbstract shape : shapes)
			shape.paint(g);
		if (lastShape != null)
			lastShape.paint(g);
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @param shapeType the shapeType to set
	 */
	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}

	private JPopupMenu createPopupMenu() {
		// TODO Auto-generated method stub
		JPopupMenu popup = new JPopupMenu();

		JMenuItem copy = new JMenuItem("copy");

		JMenuItem paste = new JMenuItem("paste");

		JMenuItem delete = new JMenuItem("delete");

		popup.add(copy);
		popup.add(paste);
		popup.add(delete);

		return popup;
	}

	public void resetpani() {
		// TODO Auto-generated method stub
		shapes = new ArrayList<ShapeAbstract>();
		repaint();
	}
}
