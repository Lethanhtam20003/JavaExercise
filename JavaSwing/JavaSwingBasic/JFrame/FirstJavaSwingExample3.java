package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstJavaSwingExample3 extends JFrame{
	public FirstJavaSwingExample3() {
		JButton b = new JButton("click");
		b.setBounds(50, 40, 100, 150);
		
		add(b);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		FirstJavaSwingExample3 e3 = new FirstJavaSwingExample3();
	}
	
}
