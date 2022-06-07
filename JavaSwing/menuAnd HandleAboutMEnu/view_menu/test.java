package view_menu;

import javax.swing.UIManager;

public class test {
	public static void main(String[] args) {
		try {
			new view_menu();
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
