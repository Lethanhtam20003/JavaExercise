package Layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Layout_BorrderLayout extends JFrame{
		public Layout_BorrderLayout() {
			this.setTitle("layout ne ");
			this.setSize(400,404);
			// căn giữa cửa sổ chương trình
			this.setLocationRelativeTo(null);
			
			/*
			 *set layout
			 */
			//
			BorderLayout Layout_1 = new BorderLayout();
			//
			BorderLayout Layout_2 = new BorderLayout(40,40);
			this.setLayout(Layout_2);
			
			//tao button
			JButton b1 = new JButton("1");
			JButton b2 = new JButton("2");
			JButton b3 = new JButton("3");
			JButton b4 = new JButton("4");
			JButton b5 = new JButton("5");
			
			//add thành phần
			this.add(b1,BorderLayout.NORTH);
			this.add(b2,BorderLayout.SOUTH);
			this.add(b3,BorderLayout.EAST);
			this.add(b4,BorderLayout.WEST);
			this.add(b5,BorderLayout.CENTER);
			
			//tắt chương trình 
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			//hiện chương trinhg
			this.setVisible(true);
		}
		public static void main(String[] args) {
			new Layout_BorrderLayout();
			
		}
}
