package controler_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view_menu.view_menu;

public class controler_menu implements ActionListener{
	private view_menu view;
	
	
	/**
	 * @param view
	 */
	public controler_menu(view_menu view) {
		this.view = view;
	}


	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		
		if(src.equals("exit")) {
			System.exit(0);
		}else {
			this.view.setTextJlabel("ban da nhan "+src);
			
		}
//		if(src.equals("new")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}else if(src.equals("open")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}else if(src.equals("exit")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}else if(src.equals("21")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}else if(src.equals("22")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}else if(src.equals("31")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}else if(src.equals("32")) {
//			this.view.setTextJlabel("ban da nhan "+src);
//		}
//		
	}

}
