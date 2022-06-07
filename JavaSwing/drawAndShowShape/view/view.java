package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class view extends JFrame {
	public view() {
		this.setTitle("Draw Shape");
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		jpanelDraw jpn = new jpanelDraw();
		
		this.setLayout(new BorderLayout());
		this.add(jpn,BorderLayout.CENTER);
		this.setVisible(true);
		//this.pack();
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("Draw Shape");
		JPanel containpain = new JPanel();
		containpain.setLayout(new BorderLayout());
		containpain.setSize(500,500);
		jpanelDraw jpn = new jpanelDraw();
		containpain.add(jpn,BorderLayout.CENTER);
		containpain.setBorder( new TitledBorder("cac hinh ve"));
		this.add(containpain);
	}
	public static void main(String[] args) {
		new view();
	}
}
