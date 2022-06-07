package view_menu;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import controler_menu.controler_menu;

public class view_menu extends JFrame {
	private JLabel label;

	public view_menu() {
		this.setTitle("menu example");
		this.setSize(400, 400);

		// initcomponent
		JPanel containpane = this.init();
		this.setContentPane(containpane);

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private JMenuBar createMenu() {
		controler_menu ac = new controler_menu(this);
		JMenuBar menubar = new JMenuBar();

		JMenu menu_1 = new JMenu("menu_1");
		JMenuItem item_new = new JMenuItem("new");
		item_new.addActionListener(ac);
		JMenuItem item_open = new JMenuItem("open");
		item_open.addActionListener(ac);
		JMenuItem item_exit = new JMenuItem("exit");
		item_exit.addActionListener(ac);
		menu_1.add(item_new);
		menu_1.add(item_open);
		menu_1.add(item_exit);

		JMenu menu_2 = new JMenu("menu_2");
		JMenuItem item_21 = new JMenuItem("21");
		item_21.addActionListener(ac);
		JMenuItem item_22 = new JMenuItem("22");
		item_22.addActionListener(ac);
		menu_2.add(item_21);
		menu_2.add(item_22);

		JMenu menu_3 = new JMenu("menu_3");
		JMenuItem item_31 = new JMenuItem("31");
		item_31.addActionListener(ac);
		JMenuItem item_32 = new JMenuItem("32");
		item_32.addActionListener(ac);
		menu_3.add(item_31);
		menu_3.add(item_32);

		menubar.add(menu_1);
		menubar.add(menu_2);
		menubar.add(menu_3);

		return menubar;
	}

	private JToolBar createToolbar() {
		JToolBar toolBar = new JToolBar();
		
		controler_menu ac = new controler_menu(this);
		
		JButton jbutton_undo = new JButton("undo");
		jbutton_undo.setToolTipText("ban djsdsajd");
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

	private JPanel init() {
		JPanel containpane = new JPanel();
		containpane.setLayout(new BorderLayout());
		// menu
		JMenuBar menubar = this.createMenu();
		this.setJMenuBar(menubar);
		// toolbar
		JToolBar toolbar = createToolbar();
		containpane.add(toolbar, BorderLayout.NORTH);
		label = new JLabel();
		containpane.add(label, BorderLayout.CENTER);

		return containpane;
	}

	public void setTextJlabel(String s) {
		label.setText(s);
	}

}
