package Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Layout_GridLayout extends JFrame{
		public Layout_GridLayout() {
			this.setTitle("layout ne ");
			this.setSize(400,404);
			// căn giữa cửa sổ chương trình
			this.setLocationRelativeTo(null);
			
			/*
			 *set layout
			 */
			//
			GridLayout Layout_1 = new GridLayout();
			//
			GridLayout Layout_2 = new GridLayout(4,4);
			//
			GridLayout Layout_3 = new GridLayout(4,4,25,25);
			this.setLayout(Layout_3);
			
			//tao button
//			JButton b1 = new JButton("1");
//			JButton b2 = new JButton("2");
//			JButton b3 = new JButton("3");
			
			//add thành phần
//			this.add(b1);
//			this.add(b2);
//			this.add(b3);
			//tao button và add nhiều thành phần
			int buttonnums = 16;
			for(int i =0;i<buttonnums;i++) {
				JButton b = new JButton(i+"");
				this.add(b);
			}
			//tắt chương trình 
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			//hiện chương trinhg
			this.setVisible(true);
		}
		public static void main(String[] args) {
			try {
//				com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//				com.sun.java.swing.plaf.motif.MotifLookAndFeel
//				com.sun.java.swing.plaf.windows.WindowsLookAndFeel

//				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				new Layout_GridLayout();
			} catch (Exception ex) {
				ex.printStackTrace();
			}	
			
		}
}
