package Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_FlowLayout extends JFrame {
	public Layout_FlowLayout() {
		this.setTitle("layout ne ");
		this.setSize(400,404);
		// căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		//set layout
		FlowLayout Flayout_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout Flayout_2 = new FlowLayout(FlowLayout.CENTER,100,101);
		FlowLayout Flayout_3 = new FlowLayout(FlowLayout.LEFT);
		this.setLayout(Flayout_2);
		//tao button
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		
		//add thành phần
		this.add(b1);
		this.add(b2);
		this.add(b3);
		//tắt chương trình 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//hiện chương trinhg
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Layout_FlowLayout();
		
	}
}

