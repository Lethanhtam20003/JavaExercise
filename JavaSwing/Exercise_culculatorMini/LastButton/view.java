package LastButton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class view extends JFrame {
	private model model;
	private JButton jbutton_1;
	private JButton jbutton_2;
	private JButton jbutton_3;
	private JButton jbutton_4;
	private JLabel jlabel;
	private JPanel jpanel_head;
	private JPanel jpanel_text;
	
	public view() {
		 model = new model();
		this.init();
		
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("last button");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Controler_listenser ac = new Controler_listenser(this);
		//tạo font chữ
		Font font = new Font("arical",Font.BOLD,40);
		 jbutton_1 = new JButton("1");
		 // gắn font chữ
		 jbutton_1.setFont(font);
		 jbutton_1.addActionListener(ac);
		 
		 jbutton_2 = new JButton("2");
		 jbutton_2.setFont(font);
		 jbutton_2.addActionListener(ac);
		 
		 jbutton_3 = new JButton("3");
		 jbutton_3.setFont(font);
		 jbutton_3.addActionListener(ac);
		 
		 jbutton_4 = new JButton("4");
		 jbutton_4.setFont(font);
		 jbutton_4.addActionListener(ac);
		
		
		 jpanel_head = new JPanel();
		jpanel_head.setLayout(new GridLayout(2,2));
		jpanel_head.add(jbutton_1);
		jpanel_head.add(jbutton_2);
		jpanel_head.add(jbutton_3);
		jpanel_head.add(jbutton_4);
		
		jlabel = new JLabel("_____");
		jlabel.setFont(font);
		 jpanel_text = new JPanel();
		jpanel_text.add(jlabel);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_head,BorderLayout.CENTER);
		this.add(jpanel_text,BorderLayout.SOUTH);
		
	}
	public void changeValue() {
		this.model.setValue_1();
		jlabel.setText("last button :"+this.model.getValue());
	}
	public void changeValue2() {
		this.model.setValue_2();
		jlabel.setText("last button :"+this.model.getValue());
	}
	public void changeValue3( ) {
		this.model.setValue_3();
		jlabel.setText("last button :"+this.model.getValue());
	}
	public void changeValue4( ) {
		this.model.setValue_4();
		jlabel.setText("last button :"+this.model.getValue());
	}
}
