package app;

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

import SHape.AShape;
import SHape.Circle;
import SHape.Line;
import SHape.Rectangle;

public class DrawingPane extends JPanel {
	private static final long serialVersionUID = 1L;
	List<AShape> shapes = new ArrayList<AShape>();
	AShape last;
	Color color;
	int shapeType;
	boolean isStarted;

	StatusBar statusBar;

	public DrawingPane(StatusBar statusBar) {
		this.statusBar = statusBar;
		setShapeType(ToolBar.LINE); // default shape
		setColor(Color.BLACK); // defaul color
		setFocusable(true);
		setBackground(Color.white);
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

		MouseAdapter adapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					if (isStarted) { // luu
						shapes.add(last);
						isStarted = false;
						last = null;
					} else { // tạo mới
						switch (shapeType) {
						case ToolBar.LINE:
							last = new Line(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case ToolBar.CIRCLE:
							last = new Circle(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						case ToolBar.RECT:
							last = new Rectangle(e.getX(), e.getY(), color);
							isStarted = true;
							break;
						}
					}
				} else {
					isStarted = false;
					last = null;
				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if (!isStarted)
					return;
				last.resize(e.getX(), e.getY());
				repaint();
			}
		};
		addMouseListener(adapter);
		addMouseMotionListener(adapter);

		addKeyListener(new KeyListener() {
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
				int keyCode = e.getKeyCode();
				if (e.isControlDown()) { // Shape: Ctrl-L, -C, -R
					switch (keyCode) {
					case KeyEvent.VK_L:
						setShapeType(ToolBar.LINE);
						break;
					case KeyEvent.VK_C:
						setShapeType(ToolBar.CIRCLE);
						break;
					case KeyEvent.VK_R:
						setShapeType(ToolBar.RECT);
						break;
					}
					return;
				}

				if (e.isAltDown()) { // Color: Ctrl-R, -G, -B
					System.out.println("dsd");
					switch (keyCode) {
					case KeyEvent.VK_R:
						setColor(Color.RED);
						break;
					case KeyEvent.VK_G:
						setColor(Color.GREEN);
						break;
					case KeyEvent.VK_B:
						setColor(Color.BLUE);
						break;
					}
					return;

				}
			}
		});
	}

	public void setColor(Color color) {
		this.color = color;
		statusBar.setColorStr(color.toString());
	}

	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;

		switch (shapeType) {
		case ToolBar.LINE:
			statusBar.setShapeStr("Đường thẳng");
			break;
		case ToolBar.SQUARE:
			statusBar.setShapeStr("Hình Vuông");
			break;
		case ToolBar.RECT:
			statusBar.setShapeStr("Hình Chữ Nhật");
			break;
		case ToolBar.CIRCLE:
			statusBar.setShapeStr("Hình Tròn");
			break;
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		setBackground(Color.WHITE);
		super.paintComponent(g);
		for (AShape shape : shapes)
			shape.paint(g);
		if (last != null)
			last.paint(g);
	}
}
