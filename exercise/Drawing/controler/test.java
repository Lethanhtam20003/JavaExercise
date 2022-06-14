package controler;

import javax.swing.UIManager;

import view.view_drawing;

public class test {
	view_drawing view;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new view_drawing();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
