/**
 * 
 */
package viewDrawingPaint;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 * @author lethanhtam
 *
 */
public class app extends JFrame {
	private static JPopupMenu popupMenu;

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

		Drawing drawing = new Drawing();

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
		JMenuItem open = new JMenuItem("open");
		JMenuItem exit = new JMenuItem("exit");
		file.add(save);
		file.add(open);
		file.add(exit);

		JMenu help = new JMenu("help");
		JMenuItem wellcome = new JMenuItem("wellcome");
		help.add(wellcome);

		menubar.add(file);
		menubar.add(help);

		return menubar;
	}

	public static void main(String[] args) {
		new app();
	}
}
