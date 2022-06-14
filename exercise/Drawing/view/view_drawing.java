package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import controler.controler_drawing_aclis;
import controler.controler_drawing_mouseLis;
import model.model_drawing;

/**
 * @author lethanhtam
 *
 */
public class view_drawing extends JFrame {
	private JPopupMenu popupMenu;
	private model_drawing model = new model_drawing();
	ActionListener ac = new controler_drawing_aclis(this);
	MouseListener mlis = new controler_drawing_mouseLis(this);
	private JPanelDraw panel;

	private JLabel labelText;

	public view_drawing() {
		this.init();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private void init() {

		this.setTitle("Drawing");
		this.pack();
		this.setSize(500, 500);
		// menubar
		JMenuBar menubar = createMENU();
		this.setJMenuBar(menubar);
		// toolbar
		JToolBar toolbar = createTOOLBAR();
		// popupmenu
		popupMenu = createPOPUPMENU();
		this.add(popupMenu);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e))
					popupMenu.show(getContentPane(), e.getX(), e.getY());
			}
		});
		this.addMouseListener(mlis);
		// containpane
		JLabel contentpane = new JLabel();
		contentpane.setLayout(new BorderLayout());
		contentpane.add(toolbar, BorderLayout.NORTH);
		contentpane.add(createpanelShow(), BorderLayout.CENTER);
		// add action listener for this
		this.setContentPane(contentpane);

	}

	private JPopupMenu createPOPUPMENU() {
		JPopupMenu popupmenu = new JPopupMenu();
		// menu item
		JMenuItem menuItem_cut = new JMenuItem("cut");
		JMenuItem menuItem_copy = new JMenuItem("copy");
		JMenuItem menuItem_past = new JMenuItem("past");
		// addactionlistener
		menuItem_copy.addActionListener(ac);
		menuItem_copy.addActionListener(ac);
		menuItem_copy.addActionListener(ac);
		menuItem_copy.addMouseListener(mlis);
		menuItem_copy.addMouseListener(mlis);
		menuItem_copy.addMouseListener(mlis);
		// add item into menu
		popupmenu.add(menuItem_cut);
		popupmenu.add(menuItem_copy);
		popupmenu.add(menuItem_past);

		return popupmenu;
	}

	/**
	 * @return
	 */
	private JPanel createpanelShow() {
		JPanel panelBorder = new JPanel();
		panelBorder.setLayout(new BorderLayout());
		setLabelText(new JLabel());
		getLabelText().setBackground(Color.gray);
		getLabelText().setBorder(new TitledBorder("Options: "));
		getLabelText().setText(" Shape:                Color: ");

		panel = new JPanelDraw();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(""));

		panelBorder.add(getLabelText(), BorderLayout.NORTH);
		panelBorder.add(panel, BorderLayout.CENTER);

		return panelBorder;
	}

	/**
	 * @return
	 */
	private JMenuBar createMENU() {
		JMenuBar jMenuBar = new JMenuBar();
		// button
		JButton button_Exit = new JButton("Exit");
		JButton button_line = new JButton("line");
		JButton button_cirle = new JButton("cirle");
		JButton button_rectangle = new JButton("rectangle");
		// dk su kien click chuot
		button_Exit.addActionListener(ac);
		button_line.addActionListener(ac);
		button_cirle.addActionListener(ac);
		;
		button_rectangle.addActionListener(ac);
		button_Exit.addMouseListener(mlis);
		button_line.addMouseListener(mlis);
		button_cirle.addMouseListener(mlis);
		button_rectangle.addMouseListener(mlis);

		// menu
		JMenu menu_file = new JMenu("file");
		menu_file.add(button_Exit);

		JMenu menu_shape = new JMenu("shape");
		menu_shape.add(button_line);
		menu_shape.add(button_cirle);
		menu_shape.add(button_rectangle);

		jMenuBar.add(menu_file);
		jMenuBar.add(menu_shape);

		return jMenuBar;
	}

	/**
	 * @return
	 */
	private JToolBar createTOOLBAR() {
		JToolBar jToolBar = new JToolBar();

		JMenuBar menubar = new JMenuBar();
		menubar.setBorder(new TitledBorder(""));
		// radio button
		JRadioButton ra1 = new JRadioButton("black");
		JRadioButton ra2 = new JRadioButton("blue");
		JRadioButton ra3 = new JRadioButton("red");
		// add action listener
		ra1.addActionListener(ac);
		ra2.addActionListener(ac);
		ra3.addActionListener(ac);
		ra1.addMouseListener(mlis);
		ra2.addMouseListener(mlis);
		ra3.addMouseListener(mlis);
		// butto group (create one option)
		ButtonGroup js = new ButtonGroup();
		js.add(ra1);
		js.add(ra2);
		js.add(ra3);
		menubar.add(ra1);
		menubar.add(ra2);
		menubar.add(ra3);

		jToolBar.add(menubar);

		return jToolBar;
	}

	public Point getLocationFirst() {
		int x = this.getX();
		int y = this.getY();

		Point res = new Point(x, y);
		return res;
	}

	public Point getLocationLast() {
		int x = this.getX();
		int y = this.getY();

		Point res = new Point(x, y);
		return res;
	}

	public void setShape(String string) {
		this.model.setSphape(string);
		System.out.println(this.model.getSphape());
	}

	public void setColorShape(String string) {
		this.model.setClolorShape(string);
		System.out.println(this.model.getClolorShape());
	}

	public JLabel getLabelText() {
		return labelText;
	}

	public void setLabelText(JLabel labelText) {
		this.labelText = labelText;
	}

	public void setLabelText(String string) {
		// TODO Auto-generated method stub
		this.labelText.setText(" Shape: " + this.model.getSphape() 
		+ "               Color: " + this.model.getClolorShape());
	}

	public void setpoint(Point point) {
		// TODO Auto-generated method stub
		if(this.model.isChangePoint()) {
		this.model.setP1(point);
		this.model.setChangePoint(!this.model.isChangePoint());
		}else {
			this.model.setP2(point);
			this.model.setChangePoint(!this.model.isChangePoint());
		}
		System.out.println("set point"+model.getP1()+"\t"+model.isChangePoint());
	}

	public JPanelDraw getPanel() {
		return panel;
	}

	public void setPanel(JPanelDraw panel) {
		this.panel = panel;
	}

	public void drawOval(Point point) {
		// TODO Auto-generated method stub
		this.panel.paintOval(point);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(this.model.getP1().x, this.model.getP1().y, 10, 10);
	}

}