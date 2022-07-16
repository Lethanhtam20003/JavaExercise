/**
 * 
 */
package viewDrawingPaint;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 * @author lethanhtam
 *
 */
public class app extends JFrame {
	private static JPopupMenu popupMenu;
	private Drawing drawing;

	/**
	 * @return the popupMenu
	 */
	public JPopupMenu getPopupMenu() {
		return popupMenu;
	}

	public app() {
		super("Paint");
		this.setSize(new Dimension(650, 650));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		JMenuBar menu = createMenubar();

		drawing = new Drawing();

		Status status = new Status(drawing);

		toolbar toolbar = new toolbar(status, drawing);

		// content pane add component
		contentPane.add(toolbar, BorderLayout.NORTH);
		contentPane.add(drawing, BorderLayout.CENTER);
		contentPane.add(status, BorderLayout.SOUTH);

		this.setJMenuBar(menu);
		this.setContentPane(contentPane);
		this.setVisible(true);
	}

	private JMenuBar createMenubar() {
		// TODO Auto-generated method stub
		JMenuBar menubar = new JMenuBar();

		JMenu file = new JMenu("file");
		JMenuItem save = new JMenuItem("save");
		save.addActionListener(actionMenu);
		JMenuItem open = new JMenuItem("open");
		open.addActionListener(actionMenu);
		JMenuItem exit = new JMenuItem("exit");
		exit.addActionListener(actionMenu);
		file.add(save);
		file.add(open);
		file.add(exit);

		JMenu help = new JMenu("help");
		JMenuItem wellcome = new JMenuItem("wellcome");
		wellcome.addActionListener(actionMenu);
		help.add(wellcome);

		menubar.add(file);
		menubar.add(help);

		return menubar;
	}

	ActionListener actionMenu = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = e.getActionCommand();
			switch (str) {
			case "save":
				
				break;
			case "open":

				break;
			case "exit":
				System.exit(0);
				break;
			case "wellcome":
				JOptionPane.showMessageDialog(drawing, "wellCome to my paint app \n I'm tam");
				break;
			}

		}
	};

	public static void main(String[] args) {
		new app();
	}
}
