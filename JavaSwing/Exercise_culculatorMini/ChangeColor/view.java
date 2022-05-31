
package ChangeColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class view extends JFrame{
	private model model;
	private JLabel jlabel;
	//private int value;
	public view() {
		this.model = new  model(1);
		this.init();
		
	}
	private void init() {
		this.setTitle("my color");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set font
		Font font_1 = new Font("timenewrument", Font.BOLD,20 );
		Font font_text = new Font("arical", Font.BOLD,40 );
		
		//set acton
		controler ac = new controler(this);
		
		//set label
		jlabel = new JLabel("text");
		jlabel.setFont(font_text);
		jlabel.setSize(300,300);
		
		JPanel jpanel_head = new JPanel();
		//jpanel_head.setLayout(new BorderLayout());
		jpanel_head.add(jlabel);
		
		//red
		JButton  jbutton_red = new JButton("red");
		jbutton_red.setFont(font_1);
		jbutton_red.setForeground(Color.red);
		jbutton_red.setOpaque(true);
		//jbutton_red.setBorderPainted(false);
		jbutton_red.addActionListener(ac);
		
		//black
		JButton  jbutton_black = new JButton("black");
		jbutton_black.setFont(font_1);
		jbutton_black.setForeground(Color.black);
		jbutton_black.setOpaque(true);
		//jbutton_black.setBorderPainted(false);
		jbutton_black.addActionListener(ac);
		
		//blue
		JButton  jbutton_blue = new JButton("blue");
		jbutton_blue.setFont(font_1);
		jbutton_blue.setForeground(Color.blue);
		jbutton_blue.setOpaque(true);
		//jbutton_blue.setBorderPainted(false);
		jbutton_blue.addActionListener(ac);
		
		//green
		JButton  jbutton_green = new JButton("green");
		jbutton_green.setFont(font_1);
		jbutton_green.setForeground(Color.black);
		jbutton_green.setBackground(Color.green);
		jbutton_green.setOpaque(true);
		//jbutton_green.setBorderPainted(false);
		jbutton_green.addActionListener(ac);
		
		//pink
		JButton  jbutton_pink = new JButton("pink");
		jbutton_pink.setFont(font_1);
		jbutton_pink.setForeground(Color.black);
		jbutton_pink.setBackground(Color.pink);
		jbutton_pink.setOpaque(true);
		//jbutton_pink.setBorderPainted(false);
		jbutton_pink.addActionListener(ac);
		
		//gray
		JButton  jbutton_gray = new JButton("gray");
		jbutton_gray.setFont(font_1);
		jbutton_gray.setForeground(Color.black);
		jbutton_gray.setBackground(Color.gray);
		jbutton_gray.setOpaque(true);
		//jbutton_gray.setBorderPainted(false);
		jbutton_gray.addActionListener(ac);
		
		//add button into jpanel
		JPanel jpanel_center = new JPanel();
		jpanel_center.setLayout(new GridLayout(2,3));
		jpanel_center.add(jbutton_red);
		jpanel_center.add(jbutton_black);
		jpanel_center.add(jbutton_blue);
		jpanel_center.add(jbutton_gray);
		jpanel_center.add(jbutton_green);
		jpanel_center.add(jbutton_pink);
		
		//change Action
		JButton jbutton_changeAc = new JButton("change ac");
		jbutton_changeAc.addActionListener(ac);
		JPanel jpanel_change = new JPanel();
		
		jpanel_change.add(jbutton_changeAc);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_head,BorderLayout.NORTH);
		this.add(jpanel_center,BorderLayout.CENTER);
		this.add(jbutton_changeAc,BorderLayout.SOUTH);
		
		
		
		
		this.setVisible(true);
	}
	public void changecolor(Color color) {
		this.jlabel.setForeground(color);
		this.jlabel.setOpaque(true);
	}
	public void changeBackGround(Color color) {
		// TODO Auto-generated method stub
		this.jlabel.setBackground(color);
		this.jlabel.setOpaque(true);
	}
	public boolean getblo() {
		// TODO Auto-generated method stub
		return model.isBlo();
	}
	public void changeAc() {
		// TODO Auto-generated method stub
		model.setBlo();
	}
	
	
	
	
}
