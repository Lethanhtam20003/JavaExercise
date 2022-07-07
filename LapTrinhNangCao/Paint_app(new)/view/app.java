package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class app extends JFrame {
	public app() {
		// TODO Auto-generated constructor stub
		super("painting app");
		this.setSize(new Dimension(500, 500));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		DrawingPanel drawingPant = new DrawingPanel();
		StatusPanel status = new StatusPanel();
		ToolBarPanel toolbar = new ToolBarPanel(status,drawingPant);

		this.add(toolbar,BorderLayout.NORTH);
		this.add(drawingPant,BorderLayout.CENTER);
		this.add(status,BorderLayout.SOUTH);

		this.setVisible(true);
	}
	public static void main(String[] args) {
		new app();
	}
	
}
