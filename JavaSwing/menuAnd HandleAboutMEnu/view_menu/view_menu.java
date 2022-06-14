package view_menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import controler_menu.controler_menu;

public class view_menu extends JFrame {
	private JLabel label;
	public JPopupMenu jpopupMenu;
	controler_menu ac = new controler_menu(this);
	private JToolBar toolbar;
	private JPanel containpane;

	/**
	 * constructor
	 */
	public view_menu() {
		this.setTitle("menu example");
		this.setSize(400, 400);

		// initcomponent
		this.init();

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void setTextJlabel(String s) {
		label.setText(s);
	}

	/**
	 * init componant
	 */
	private void init() {
		containpane = new JPanel();
		containpane.setLayout(new BorderLayout());
		// menu
		JMenuBar menubar = this.createMenu();
		this.setJMenuBar(menubar);

		// jpopupMenu
		jpopupMenu = creaJpopupMenu();
		this.add(jpopupMenu);
		MouseListener ac1 = new controler_menu(this);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e))
				jpopupMenu.show(getContentPane(), e.getX(), e.getY());
			}
		});
		URL h = MainView.class.getResource("exit_icon.png");
		// toolbar
		toolbar = createToolbar();
		this.add(toolbar);
		label = new JLabel();
		containpane.add(label, BorderLayout.CENTER);
		//this.setContentPane(containpane);
	}

	/**
	 * create menu
	 * 
	 * @return
	 */
	private JMenuBar createMenu() {
		JMenuBar menubar = new JMenuBar();

		JMenu menu_file = new JMenu("file");
		JMenuItem item_new = new JMenuItem("new");
		item_new.addActionListener(ac);
		JMenuItem item_open = new JMenuItem("open");
		item_open.addActionListener(ac);
		JMenuItem item_exit = new JMenuItem("exit");
		item_exit.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("exit_icon.png"))));
		item_exit.addActionListener(ac);
		menu_file.add(item_new);
		menu_file.add(item_open);
		menu_file.add(item_exit);

		JMenu menu_Edit = new JMenu("Edit");
		JMenuItem item_undo = new JMenuItem("undo");
		item_undo.addActionListener(ac);
		JMenuItem item_redo = new JMenuItem("redo");
		item_redo.addActionListener(ac);
		menu_Edit.add(item_undo);
		menu_Edit.add(item_redo);

		JMenu menu_view = create_JcheckboxMenuItem();

		JMenu menu_help = new JMenu("help");
		JMenuItem item_wellcome = new JMenuItem("wellcome");
		item_wellcome.addActionListener(ac);
		JMenuItem item_preferences = new JMenuItem("preferences");
		item_preferences.addActionListener(ac);
		menu_help.add(item_wellcome);
		menu_help.add(item_preferences);

		menubar.add(menu_file);
		menubar.add(menu_Edit);
		menubar.add(menu_view);
		menubar.add(menu_help);

		return menubar;
	}

	/**
	 * create TOOLbar
	 * 
	 * @return
	 */
	private JToolBar createToolbar() {
		JToolBar toolBar = new JToolBar();

		controler_menu ac = new controler_menu(this);

		JButton jbutton_undo = new JButton("undo");
		jbutton_undo.setMnemonic('u');
		jbutton_undo.setToolTipText("this is undo button");
		jbutton_undo.addActionListener(ac);
		JButton jbutton_redo = new JButton("redo");
		jbutton_redo.addActionListener(ac);
		JButton jbutton_copy = new JButton("copy");
		jbutton_copy.addActionListener(ac);
		JButton jbutton_cut = new JButton("cut");
		jbutton_cut.addActionListener(ac);
		JButton jbutton_past = new JButton("past");
		jbutton_past.addActionListener(ac);

		toolBar.add(jbutton_undo);
		toolBar.add(jbutton_redo);
		toolBar.add(jbutton_copy);
		toolBar.add(jbutton_cut);
		toolBar.add(jbutton_past);

		return toolBar;
	}

	/**
	 * create popup Menu
	 * 
	 * @return
	 */
	public JPopupMenu creaJpopupMenu() {
		jpopupMenu = new JPopupMenu("font");

		JMenu jmenufont = new JMenu("view");

		JMenuItem undo = new JMenuItem("undo");
		undo.addActionListener(ac);
		JMenuItem redo = new JMenuItem("redo");
		redo.addActionListener(ac);
		JMenuItem copy = new JMenuItem("copy");
		copy.addActionListener(ac);
		JMenuItem cut = new JMenuItem("cut");
		cut.addActionListener(ac);
		JMenuItem past = new JMenuItem("past");
		past.addActionListener(ac);

		jmenufont.add(undo);
		jmenufont.add(redo);

		jpopupMenu.add(jmenufont);
		jpopupMenu.add(copy);
		jpopupMenu.add(cut);
		jpopupMenu.add(past);

		return jpopupMenu;
	}

	/**
	 * create check box menu item
	 * 
	 * @return
	 */
	public JMenu create_JcheckboxMenuItem() {
		JMenu menu_view = new JMenu("view");
		menu_view.addActionListener(ac);
		JCheckBoxMenuItem checkbox = new JCheckBoxMenuItem("show tab");
		checkbox.addActionListener(ac);
		menu_view.add(checkbox);
		return menu_view;
	}

	public void enableToolbar() {
		containpane.add(toolbar, BorderLayout.NORTH);

	}
	
	public void disenableToolbar() {
		containpane.remove(toolbar);

	}
	public void refreshthis() {
		Dimension s = this.getSize();
		this.pack();
		this.setSize(s);
	}

}
