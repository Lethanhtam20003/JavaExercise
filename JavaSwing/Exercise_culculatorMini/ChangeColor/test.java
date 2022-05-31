package ChangeColor;

import javax.swing.UIManager;

public class test {
	 public static void main(String[] args) {
		 try {
			 
		view v = new view();
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		 }catch (Exception e) {
			e.printStackTrace();
		}
	}
}
