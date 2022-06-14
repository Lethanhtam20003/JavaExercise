package ThiGiuaKyPhanSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class view extends JFrame{
	private model model;
	controler_Ac ac = new controler_Ac(this);
	/**
	 * @param model
	 * @throws HeadlessException
	 */
	public view() throws HeadlessException {
		super("dãy dảm dần");
		this.model = new model();
		this.init();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.pack();
		this.setVisible(true);
		
	}

	private void init() {
		// TODO Auto-generated method stub
		JPanel contentpane = new JPanel();
		contentpane.setLayout(new BorderLayout());
		contentpane.add(creapaneSOUTH(),BorderLayout.SOUTH);
		contentpane.add(creapanecenter(),BorderLayout.CENTER);
		contentpane.add(creapanenNORTH(),BorderLayout.NORTH);
		this.setContentPane(contentpane);
		
	}

	private JPanel creapanenNORTH() {
		// TODO Auto-generated method stub
		JPanel res = new JPanel();
		res.setLayout(new FlowLayout());
		res.add(new Label("nhập n: "),RIGHT_ALIGNMENT);
		
		JTextField textfield = new JTextField();
		textfield.setSize(100,100);
		res.add(textfield);
		
		JButton button_taoday = new JButton("tao dãy");
		res.add(button_taoday);
		JButton button_kiemtra = new JButton("kiểm tra dãy");
		res.add(button_kiemtra);
		return res;
	}

	private JPanel creapanecenter() {
		JPanel res = new JPanel();
		res.setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBorder(new TitledBorder(""));
		textArea.setSize(500,500);
		res.add(textArea,BorderLayout.CENTER);
		return res;
	}

	private JPanel creapaneSOUTH() {
		JPanel res = new JPanel();
		JTextField textfiels_res= new JTextField();
		res.add(textfiels_res);
		return res;
	}
	
	
}
