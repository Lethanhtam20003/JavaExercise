package LastButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controler_listenser implements ActionListener {
	private view view;
	public Controler_listenser(view view) {
		this.view =view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("1")) {
			this.view.changeValue();
		}else if(src.equals("2")){
			this.view.changeValue2();
		}else if(src.equals("3")){
			this.view.changeValue3();
		}else if(src.equals("4")){
			this.view.changeValue4();
		}
	}
	
}
