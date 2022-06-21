package MyNptepadview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import MyNotepadControler.MyNotepadAction;
import MyNotepadModel.MyNotepadModel;

public class MyNotepadview extends JFrame {

	private JPanel contentPane;
	private MyNotepadModel model;
	MyNotepadAction ac = new MyNotepadAction();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotepadview frame = new MyNotepadview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyNotepadview() {
		super("My notepad");
		this.model = new MyNotepadModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		JLabel jlbShowfile = new JLabel("");
		jlbShowfile.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jlbShowfile.setHorizontalAlignment(SwingConstants.LEFT);
		jlbShowfile.setBackground(Color.WHITE);
		jlbShowfile.setBounds(10, 9, 221, 30);
		panel.add(jlbShowfile);
		
		JButton jbtOpen = new JButton("open");
		jbtOpen.addActionListener(ac);
		jbtOpen.setBounds(241, 16, 57, 23);
		panel.add(jbtOpen);
		
		JButton jbtSave = new JButton("save");
		jbtSave.addActionListener(ac);
		jbtSave.setBounds(333, 16, 57, 23);
		panel.add(jbtSave);
		
	}

}
