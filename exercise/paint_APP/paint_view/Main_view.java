package paint_view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_view extends JFrame{

	private JPanel contentPane;
	private JLabel label;

	/**
	 * Create the frame.
	 */
	public Main_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 472);

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//
		panel_showText panel_show = new panel_showText();
		contentPane.add(panel_show, BorderLayout.SOUTH);

		//
		Panel_Drawpant panel_DrawingPant = new Panel_Drawpant();
		contentPane.add(panel_DrawingPant, BorderLayout.CENTER);
		
		//
		panel_toolbar panel_toolbar = new panel_toolbar(panel_show,panel_DrawingPant);
		contentPane.add(panel_toolbar, BorderLayout.NORTH);

		setVisible(true);

	}

}
