package JFrame;

import javax.swing.JFrame;

public class JFrameMain extends JFrame {
	public JFrameMain() {
		
	}
	public void showIt(String a,int wight,int height) {
		this.setSize(wight,height);
		this.setTitle(a);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void showIt() {
		this.setSize(300,300);
		this.setTitle("tiêu đề của JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameMain j1 = new JFrameMain();
		j1.showIt();
		JFrameMain j2 = new JFrameMain();
		j2.showIt("tiêu đề của JFrame",400,450);
	}
}
